package week01.advanced;

import java.util.Scanner;

public class SnailArray {

	public static void main(String[] args) {
		System.out.println("<달팽이 배열 만들기>");
//		21단계 (심화): 달팽이 배열 만들기
//		문제: 사용자로부터 숫자 N을 입력받아,
//		N x N 크기의 2차원 배열에 달팽이 모양으로 1부터 N*N까지의 숫자를 채워 넣고 
//		달팽이 모양: (0,0)→ 시계방향 → 바깥에서 안쪽으로 채워 나가는 것
//		출력하는 프로그램을 작성하세요.
//		핵심 사고: 방향 전환을 위한 논리, 배열의 인덱스 경계 확인
//		힌트: `다중 배열`, `for문` 또는 `while문`, `if문`, `방향을 제어하는 변수`
		/* (0,0) (0,1) (0,2) (0,3) ...(0,n)
		 * (1,0) (1,1) (1,2) (1,3) ...(1,n)
		 * (2,0) (2,1) (2,2) (2,3) ...(2,n)
		 * (3,0) (3,1) (3,2) (3,3) ...(3,n)
		 *  ...
		 * (n,0) (n,1) (n,2) (n,3) ...(n,n)
		 * if n=4
		 * 1  2  3  4
		 * 12 13 14 5
		 * 11 16 15 6
		 * 10 9  8  7
		 */
		/* printf: 형식(format)을 지정해서 칸폭, 정렬, 소수점 자리, 콤마(,)등을 정밀하게 조정 가능
		 * %d: 정수(decimals), %s: 문자열, %f: 실수(기본 소수점 6자리), %%: 퍼센트 기호 자체 출력
		 * "%" + width + "d "-> if width=4 -> %4d -> 폭(너비)=4
		 * if 1,2,3,4,5,6 -> 1234 56
		 * %nd->오른쪽 정렬 / %-nd->왼쪽 정렬
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.> ");
		int N = scanner.nextInt();
		
        while(N<1) {                                       
            System.out.println("숫자를 잘못 입력하셨습니다.");          
    		System.out.println("1이상의 정수를 입력해주세요.> ");
    		N = scanner.nextInt();                                      
        }
        
        /* dir=현재 방향 인덱스 -> 지금 어느 방향으로 가야 하는지 번호로 저장(간편함 위해 생성) 
         * 0(오른쪽),1(아래),2(왼쪽),3(위) -> 달팽이 모양은 오른쪽(0)으로 시작
         * int[] dx, int []dy => {오른,아래,왼,위} 
         * int[0] dx, int[0] dy -> 오른쪽으로 이동(행변화X(0),열변화->오른+1)
         * */
		int [][]snail = new int [N][N];
		int x = 0, y = 0; // 현재 위치(0,0)->(행,열)
        int dir = 0;
        int[] dx = {0, 1, 0, -1}; // 행 변화: 아래+1,위-1
        int[] dy = {1, 0, -1, 0}; // 열 변화: 오른+1,왼-1
        
        for (int i=0; i<N*N; i++) { 
            snail[x][y] = i+1; // 대입값은 1부터 시작이므로 i+1로 시작
            
            int nx = x + dx[dir]; // 다음 행 좌표 = 현재 x + dx[dir]
            int ny = y + dy[dir]; //다음 열 좌표 = 현재 y + dy[dir]

            /* 범위밖 : N<=nx(행)<0 , N<=ny(열)<0
             * 이미 채워진 칸 : 범위밖X +  배열값!=0 */
            boolean outOfRange = (nx < 0 || nx >= N || ny < 0 || ny >= N);
            boolean alreadyFilled = (!outOfRange && snail[nx][ny] != 0);
            
            if (outOfRange || alreadyFilled) { // 범위밖 or 이미 채워진 칸
                dir = (dir + 1) % 4; // % 4는 3보다 커지는 거 방지
                nx = x + dx[dir]; // 회전 후 행 좌표
                ny = y + dy[dir]; // 회전 후 열 좌표
            }
            x = nx; // 현재 행 위치 갱신
            y = ny; // 현재 열 위치 갱신
        }
        /* String.valueOf(N*N)->정수 값을 문자로
         * if N=4 -> N*N=16
         * .length()->문자 개수(자릿수)
         * 16->2 => 칸 수=2 ex) 1234 -> 1 2 3 4
         */
        int width = String.valueOf(N*N).length();//칸 수 2

		for(int i=0; i<snail.length; i++) {
			for(int j=0; j<snail[i].length; j++) {
				//"d " d뒤에 공백 추가로 칸 수+1 (->띄어쓰기를 통해 가독성 증가)
				 System.out.printf("%" + width + "d ", snail[i][j]); //printf 설명 위에
			}
			System.out.println();
		}
		scanner.close();
	}
}