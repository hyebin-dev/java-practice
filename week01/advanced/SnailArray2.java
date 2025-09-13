package week01.advanced;

import java.util.Scanner;

public class SnailArray2 {

	public static void main(String[] args) {
		System.out.println("<달팽이 배열 만들기2>");
//		21단계 (심화): 달팽이 배열 만들기
//		문제: 사용자로부터 숫자 N을 입력받아,
//		N x N 크기의 2차원 배열에 달팽이 모양으로 1부터 N*N까지의 숫자를 채워 넣고 
//		출력하는 프로그램을 작성하세요.
//		달팽이 모양: (0,0) → 시계방향 → 바깥에서 안쪽
//		핵심 사고: 방향 전환을 위한 논리, 배열의 인덱스 경계 확인
//		힌트: `다중 배열`, `for문` 또는 `while문`, `if문`, `방향을 제어하는 변수`
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.>");
		int N = scanner.nextInt();
		int snail[][] = new int [N][N];
		
		/* 아직 안채운 열과 행의 경계
		 * if 6*6 배열
		 * 위에 0번째 행 채우고 아래쪽 4,5번째 행 채웠을때
		 * -> top=1,bottom=3
		 * 왼쪽에 0,1,2번째 열 채우고 오른쪽 5번째 행 채웠을때
		 * -> left=3,right=4
		 */
		int top = 0;  
		int bottom = N-1; 
		int left = 0;
		int right = N-1;
		int cnt = 1;
		
		/* (0,0)   (0,1)   (0,2)   (0,3)  ... (0,N-1)
		 * (1,0)   (1,1)   (1,2)   (1,3)  ... (1,N-1)
		 * (2,0)   (2,1)   (2,2)   (2,3)  ... (2,N-1)
		 * (3,0)   (3,1)   (3,2)   (3,3)  ... (3,N-1)
		 * (4,0)   (4,1)   (4,2)   (4,3)  ... (4,N-1)
		 * ...
		 * (N-1,0) (N-1,1) (N-1,2) (N-1,3)... (N-1,N-1)
		 */
		
		// 달팽이: 오른쪽으로->아래로->왼쪽으로->위로
		// top,bottom은 행 체크용/ left,right는 열 체크용
		while(cnt<=N*N) { //while(top<=bottom&&left≤right)
			/* 오른쪽으로
			 * top<=bottom
			 * if top=1 bottom=4 이면 0행,5행 채우고 1,2,3,4행 아직 못채움.
			 * if top=3 bottom=2이면 교차되서 더이상 채울 행이 없음.
			 */
			if(cnt<=N*N && top<=bottom) {
			    for (int c = left; c <= right; c++) { //열 왼쪽에서 오른쪽으로 이동
			        snail[top][c] = cnt++;      //행은 고정 열 오른쪽으로 이동하면서 숫자 하나씩 채우기    
			    }
			    top++; //한줄 밑으로 이동 (0,N-1)->(1,N-1)                              
			}
			/* 아래로
			 * left<=right
			 * if left=1 right=4 이면 0열,5열 채우고 1,2,3,4열 아직 못채움.
			 * if left=3 right=2이면 교차되서 더이상 채울 열이 없음.
			 */
			if(cnt<=N*N && left<=right) {
			    for (int c = top; c <= bottom; c++) { //행 위에서 아래로 이동
			        snail[c][right] = cnt++;      //열은 고정 행 아래로 이동하면서 숫자 하나씩 채우기  
			}
			    right--;//왼쪽으로 이동(N-2,N-2), N-1행이었으면 N-2행으로
			}
			//왼쪽으로
			if(cnt<=N*N && top<=bottom) {
			    for (int c = right; c >= left; c--) { //c--,c 범위 주의! 열 오른쪽에서 왼쪽으로 이동
			        snail[bottom][c] = cnt++;      //행은 고정 열 왼쪽으로 이동하면서 숫자 하나씩 채우기    
			    }
				bottom--;//위쪽으로 이동 (N-1,0)->(N-2,0)
			}
			//위로
			if(cnt<=N*N && left<=right) { 
			    for (int c = bottom; c >= top; c--) { //c--,c 범위 주의! 행 아래에서 위로 이동
			        snail[c][left] = cnt++;      //열은 고정 행 위로 이동하면서 숫자 하나씩 채우기
			}
			    left++;//오른쪽으로 이동 (1,0)->(1,1)
			}
		}
		for(int i=0; i<snail.length;i++) {
			for(int j=0;j<snail[i].length; j++) {
				System.out.print(snail[i][j]+" ");	
			}
			System.out.println();
		}
		
		scanner.close();
	}

}