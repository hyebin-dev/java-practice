package week01.advanced;

public class MinesweeperGenerator {

	public static void main(String[] args) {
		System.out.println("<지뢰 찾기 판>");
//		28단계 (심화): 지뢰 찾기 판 만들기
//		문제: 10x10 크기의 2차원 배열을 이용해 지뢰 찾기 판을 만듭니다.
//		먼저 10개의 지뢰('B')를 임의의 위치에 배치합니다.
//		그 후, 지뢰가 아닌 모든 칸에 대해 그 칸 주변 8방향에 있는 
//		지뢰의 개수를 숫자로 채워 넣고 완성된 판을 출력하세요.
//		핵심 사고: 지뢰를 먼저 배치한 후, 모든 칸을 순회하며
//		각 칸의 주변 8칸을 다시 검사하는 복잡한 로직
//		힌트: `다중 배열`(char[][] 또는 int[][]), `Math class`(지뢰 위치 생성),
//		`이중 for문` 2개 중첩
		char [][] board = new char[10][10];
		
		int bomb = 10;
		int placed = 0;
		
		while(placed<bomb) {
			int r = (int) (Math.random()*(board.length)); // 행 랜덤으로 뽑기
			int c = (int) (Math.random()*(board[0].length)); // 열 랜덤으로 뽑기 
			if(board[r][c]=='B') {
				continue;
			}
			else {
				board[r][c]='B';
				placed++;
			}
		}
		/* 서(-1) 북(-1) 동(1) 남(1)
		 *  서 서북 북 북동 동 동남 남 남서*/
		int []dr = {0,-1, -1, -1, 0, 1, 1, 1}; //행
		int []dc = {-1,-1, 0, 1, 1, 1, 0, -1}; //열
		char [][]bombBoard = new char[board.length][board[0].length];
		
		for(int i=0;i<board.length;i++) {
			for(int j=0; j<board[i].length;j++) {
				int cnt=0;
				if(board[i][j]=='B') {
					bombBoard[i][j]='B';
					continue;
				}
				for(int k=0; k<dr.length;k++) {
					int nr = i+dr[k];
					int nc = j+dc[k];
					boolean inRange=(nr>=0&&nr<board.length&&nc>=0&&nc<board[0].length);
					if(inRange&&board[nr][nc]=='B') {
						cnt++;
					}
				}
				bombBoard [i][j] = (char)('0' + cnt);
			}
		}
		for(int i=0;i<bombBoard.length;i++) {
			for(int j=0; j<bombBoard[i].length;j++) {
				System.out.print(bombBoard[i][j]+" ");
			}
			System.out.println();
			}
	}
}