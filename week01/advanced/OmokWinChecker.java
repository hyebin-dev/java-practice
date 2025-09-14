package week01.advanced;

import java.util.Random;

public class OmokWinChecker {

	public static void main(String[] args) {
		System.out.println("<오목 승리 판정하기>");
//		29단계 (심화): 오목 승리 판정하기
//		문제: 19x19 크기의 2차원 char 배열로 오목판이 주어져 있다고 가정하고,
//		특정 위치에 `[x, y]`에 방금 돌(`'B'` 또는 `'W'`)이 놓였다고 할 때,
//		그 돌로 인해 게임이 끝났는지(정확히 5개가 연속되는지) 판정하는 프로그램을 작성하세요.
//		가로, 세로, 대각선 2종류(총 4방향)를 모두 검사해야 합니다.
//		핵심 사고: 한 점을 기준으로 4개의 방향(가로, 세로, 대각선)으로 
//		5개의 돌이 연속되는지를 탐색하는 로직
//		힌트: `다중 배열`, `if문`, 각 방향을 검사하는 `for문` 또는 `while문`
        int N = 19;
        char EMPTY = '\0', BLACK = 'B', WHITE = 'W';
        // 가로, 세로, 왼쪽위오른쪽아래, 왼쪽아래오른쪽위
        int[] dr = {0, 1, 1, 1};
        int[] dc = {1, 0, 1,-1};

        char[][] board = new char[N][N];
        Random rnd = new Random();

        // 흑돌,백돌 50개씩 랜덤으로 놓기
        int bPlaced = 50, wPlaced = 50, bCount=0, wCount=0;
        while (bCount < bPlaced) {
        	int r=rnd.nextInt(N), c=rnd.nextInt(N);
        	if (board[r][c]==EMPTY){
        		board[r][c]=BLACK;
        		bCount++;
        		}
        	}
        while (wCount < wPlaced) {
        	int r=rnd.nextInt(N), c=rnd.nextInt(N);
        	if (board[r][c]==EMPTY){
        		board[r][c]=WHITE;
        		wCount++;
        		}
        	}

        // 흑돌 or 백돌(랜덤) 4연속을 17개 놓기(방향/색 랜덤)
        int lineCnt = 17;
            int placedLine = 0;
            
            while(placedLine<lineCnt) { // 4연속 17개 만들어지면 빠져나오기
            	char color = rnd.nextBoolean() ? BLACK : WHITE; // 색 랜덤
                int dir = rnd.nextInt(4), dx = dr[dir], dy = dc[dir]; // 방향 랜덤
                int sr = rnd.nextInt(N); // 행 랜덤
                int sc = rnd.nextInt(N); // 열 랜덤

                int er = sr + dx * 3; // 마지막 행(0,1,2,3->총 4개) 시작+이동*3
                int ec = sc + dy * 3; // 마지막 열(0,1,2,3->총 4개) 시작+이동*3
                if (er >= 0 && er < N && ec >= 0 && ec < N) { // 범위안인지 검사
                    int step = 0;
                    while (step < 4) { // 연속 4칸 검사
                        int r = sr + dx * step; // 현재 행
                        int c = sc + dy * step; // 현재 열
                        if (board[r][c] != EMPTY) break; // 하나라도 빈칸이 아니면 실패
                        step++;
                    }
                    if (step == 4) { // 연속 4칸 빈칸 확인되면
                    	step = 0; // 0으로 초기화하고
                        while (step < 4) { // 빈칸 확인된 4칸 채우기
                            board[sr + dx * step][sc + dy * step] = color; // 랜덤색 뽑은걸로 하나씩 이동하면서 채우기
                            step++;
                        }
                        placedLine++;
                    }
                }
            }

        // 마지막 수 놓기(자리,색 랜덤)
        char lastColor = rnd.nextBoolean() ? BLACK : WHITE;
        int x, y;
        while (true) {
            x = rnd.nextInt(N);
            y = rnd.nextInt(N);
            if (board[x][y] == EMPTY) {
            	board[x][y] = lastColor; 
            	break; 
            	}
        }

        // 오목판 출력: EMPTY는->'.', 마지막 수->'L'
        System.out.println();
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
            	if(i==x&&j==y) {
            		System.out.print("L ");
            	}
            	else {
            		System.out.print(board[i][j] == EMPTY ? '.'+" " : board[i][j]+" ");
            	}
            }
            System.out.println();
        }
        System.out.println();

        // 마지막 수 기준으로 승패가 결정났는지 확인
        boolean win = false;
        for (int i = 0; i < 4; i++) { // 4방향 확인
            int dx = dr[i], dy = dc[i];
            
            int fCnt = 0; // 정방향 연속 개수
            int r = x + dx, c = y + dy; // 4방향 이동후 행과 열
            while (0 <= r && r < N && 0 <= c && c < N && board[r][c] == lastColor) { // 범위안 && 같은색
            	fCnt++;
            	r += dx; c += dy; // 한 칸씩 이동
            	}

            int bCnt = 0;// 역방향 연속 개수
            r = x - dx; c = y - dy; 
            while (0 <= r && r < N && 0 <= c && c < N && board[r][c] == lastColor) {
            	bCnt++;
            	r -= dx; c -= dy; 
            	}

            if (1 + fCnt + bCnt != 5) { // 마지막수+같은색돌(정방향+역방향) -> 5가 아니면 통과해서 다음 i 확인
            	continue;
            }
            
            int ax = x - dx * (bCnt + 1), ay = y - dy * (bCnt + 1); // 시작쪽 바깥 -> 현재-방향*(역방향 이동한 횟수+1), - : (역방향으로 이동)
            int bx = x + dx * (fCnt + 1), by = y + dy * (fCnt + 1); // 끝쪽 바깥 (정방향으로 이동)
            boolean overStart = (0 <= ax && ax < N && 0 <= ay && ay < N) && board[ax][ay] == lastColor; // 바깥 위치가 범위 안 && 마지막수와 색깥이 같음
            boolean overEnd = (0 <= bx && bx < N && 0 <= by && by < N) && board[bx][by] == lastColor;

            if (!overStart && !overEnd) { // 6연속 아니면 승리
            	win = true;
            	break;
            }
        }

        // 승패 판정 여부
        if (win) {
            System.out.println(lastColor + "가 (" + x + ", " + y + ")에 두어 승리하였습니다.");
        } else {
            System.out.println(lastColor + "의 마지막 수 (" + x + ", " + y + ")로 승패가 결정나지 않았습니다.");
        }
    }
}