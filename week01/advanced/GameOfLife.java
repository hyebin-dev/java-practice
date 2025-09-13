package week01.advanced;

import java.util.Random;

public class GameOfLife {

	public static void main(String[] args) {
		System.out.println("<라이프 게임(Game of Life) 1세대 구현>");
		System.out.println();
//		26단계 (심화): 라이프 게임(Game of Life) 1세대 구현
//		문제: 10x10 크기의 2차원 배열에 생명체(1)와 공간(0)을 임의로 배치합니다.
//		다음 세대의 상태를 계산하여 새로운 2차원 배열에 저장하고 출력하세요.
//		- 규칙:
//		  1. 살아있는 칸 주변(8방향)에 살아있는 칸이 2개 미만이면, 외로워서 죽는다. (0)
//		  2. 살아있는 칸 주변에 살아있는 칸이 2개 또는 3개이면, 다음 세대에도 산다. (1)
//		  3. 살아있는 칸 주변에 살아있는 칸이 3개 초과이면, 과밀하여 죽는다. (0)
//		  4. 죽어있는 칸 주변에 살아있는 칸이 정확히 3개이면, 새로운 생명이 탄생한다. (1)
//		핵심 사고: 2차원 배열의 특정 위치를 기준으로 주변 8칸을 탐색하고
//		경계 조건을 처리하는 능력
//		힌트: `다중 배열`, `이중 for문` (전체 배열 탐색), 
//		`이중 for문` (주변 8칸 탐색)
		
//				{1,0,1,0,1,0,1,0,0,1},
//				{0,1,0,1,0,0,1,0,0,0},
//				{0,1,0,0,1,1,1,1,1,0},
//				{1,1,1,0,0,0,0,0,1,1},
//				{0,1,1,0,1,1,0,0,1,0},
//				{0,0,0,0,1,1,1,1,1,1},
//				{0,1,1,0,0,1,1,0,0,1},
//				{1,1,1,0,0,0,1,0,1,0},
//				{1,1,0,0,0,1,1,0,1,0}};
//		
//		for (int i = 0; i < 10; i++) { // 배운 거 활용
//		    for (int j = 0; j < 10; j++) {
//		    	arr[i][j] = (int)(Math.random()*2);
//		    }
//		    }
		/* nextInt() (인자 없음): int의 전체 범위에서 균등하게 하나 (음수 포함).
		 * nextInt(n): 0 이상 n 미만의 정수 하나 (항상 음수 아님).
		 * 0 또는 1: rand.nextInt(2)
		 * 1~6(주사위): rand.nextInt(6) + 1
		 * a~b (포함, a ≤ b): rand.nextInt(b - a + 1) + a */
		Random rand = new Random(); // 새로 배운 랜덤수 생성
		int[][] arr = new int[10][10];
		for (int i = 0; i < 10; i++) {
		    for (int j = 0; j < 10; j++) {
		        arr[i][j] = rand.nextInt(2); // 0 또는 1
		    }
		}
		System.out.println("-------초기 배열-------");
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
		System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		/*      북(-1) 
		 * 서(-1)     동(+1)
		 *      남(+1)
		 * 8방향 {서,북서,북,북동,동,동남,남,남서}
		 * 서,동: 행 변화X, 열 변화O
		 * 북,남: 행 변화O, 열 변화X
		 * 북서,북동,동남,남서: 행 변화O, 열 변화O
		 */
		int[]dr={0, -1, -1, -1, 0, 1, 1, 1}; // 행 변화
		int[]dc={-1, -1, 0, 1, 1, 1, 0, -1}; // 열 변화

		int[][] next = new int[arr.length][arr[0].length];
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				int cnt = 0; // 매번 살아있는 칸 초기화
				for(int k=0;k<dr.length;k++) { // i,j->행,열 탐색 k->주변 8방향 확인
					int nx = i+dr[k]; // 행 탐색
					int ny = j+dc[k]; // 열 탐색
		            boolean outOfRange = (nx<0||nx>=arr.length||ny<0||ny>=arr[0].length);
		            if(!outOfRange&&arr[nx][ny]==1) { // 살아있는 칸 개수 확인
		            	cnt++;
		            }
				}
		            if(arr[i][j]==1) { // 살아있는 칸 주변에
		            	if(cnt<2) {
		            		next[i][j]=0;//죽음
		            	}
		            	else if(cnt==2||cnt==3) {
		            		next[i][j]=1;//생존
		            	}
		            	else if(cnt>3) {
		            		next[i][j]=0;//죽음
		            	}
		            	
		            }
		            else if(arr[i][j]==0&&cnt==3) { // 죽어있는 칸 주변에
		            	next[i][j]=1;//탄생
				}
			}
		}
		System.out.println();
		System.out.println("----게임 진행 후 배열----");
		for(int i=0; i<next.length;i++) {
			for(int j=0; j<next[i].length;j++) {
				System.out.print(next[i][j]+" ");
			}
			System.out.println();
			}
	}
}
