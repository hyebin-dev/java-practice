package week02.advanced;

public class Minesweeper {
	private int N;
	private char [][] board;
	
	 Minesweeper(int N) {
		this.N = N;
		this.board = new char [N][N];
		for (int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				board[i][j] = '0';
			}
		}
	}
	
	void plantMines(int mineCount){
		
		if(mineCount > N*N || mineCount < 0) {
			System.out.println("지뢰 개수는 0부터 N*N이어야 합니다.");
			return; // 무한 루프 방지 즉시 종료
		}
		
		int placed = 0;
		
		while( placed < mineCount ) {
		int r = (int)(Math.random()*N);
		int c = (int)(Math.random()*N);
		if(board[r][c] == '0') {
		board[r][c] = 'B';
		placed++;
		}
		}
		
	}
	
	void calculateNumbers(){
		// 서, 북서, 북, 북동, 동, 남동, 남, 남서
		int [] r = {0, -1, -1, -1, 0, 1, 1, 1}; // 행
		int [] c = {-1, -1, 0, 1, 1, 1, 0, -1}; // 열
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(board[i][j] == 'B') {
					continue;
				}
				int cnt = 0;
				for(int k = 0; k < r.length; k++) {
				int dx = i + r[k];
				int dy = j + c[k];
				if (dx >= 0 && dx < N && dy >= 0 && dy < N) {
					if (board[dx][dy] == 'B') {
						cnt++;
					}
				}
				}
				board[i][j] = (char)('0' + cnt);
			}
		}
		
	}
	
	void printBoard(){
		for ( char [] r : board ) {
			for ( char c : r ) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
	
//	22단계 (심화): 클래스 기반의 지뢰 찾기 판 생성
//	문제: 1주차 28번 지뢰 찾기 판 만들기를 클래스로 재설계하세요.
//	    1. Minesweeper.java 클래스를 만듭니다.
//	    2. char[][] board 보드판을 멤버 변수로 가집니다. 생성자에서 보드의 크기(e.g., 10x10)를
//	    받아 초기화합니다.
//	    3. 지뢰를 랜덤하게 심는 plantMines(int mineCount) 메서드를 만듭니다.
//	    4. 지뢰 주변의 숫자를 계산하는 calculateNumbers() 메서드를 만듭니다.
//	    5. 보드판을 출력하는 printBoard() 메서드를 만듭니다.
//	    Game.java에서 Minesweeper 객체를 생성하고 메서드들을 순서대로 호출하여 완성된 지뢰 찾기
//	    판을 출력하세요.
//	핵심 사고: 복잡한 절차를 가진 프로그램을 데이터(보드판)와 기능(지뢰심기, 숫자계산)으로 나누어
//	클래스로 묶는 객체 지향적 설계를 연습합니다.
//	힌트: 클래스, 멤버 변수(2차원 배열), 생성자, 메서드, Math class, 이중 for문, if문

}
