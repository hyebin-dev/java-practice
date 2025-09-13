package week01.intermediate;

public class BingoBoardGenerator2 {

	public static void main(String[] args) {
		System.out.println("<빙고 게임 판 만들기 및 숫자 확인>");
//		20단계(응용): 빙고 게임 판 만들기 및 숫자 확인
//		문제: 5x5 빙고 판을 1부터 25까지의 숫자로 무작위로 채웁니다(숫자 중복 X).
//		그 후 사용자로부터 숫자를 하나씩 입력받아, 빙고 판에서 해당 숫자를 찾아 'X'로 바꾼 뒤 
//		매번 빙고 판을 다시 출력해주세요. 이 과정을 5번 반복합니다.
//		힌트: 다중 배열, Math class(숫자 섞기), for문, if문, input
		int [][] bingo = new int[5][5];
		
		// 방법 2: 난수 뽑고 중복 검사 흐름
		/* cnt/bingo[].length->행 cnt%bingo[0].length->열
		 * if 5X5 arr[].length = 5
		 * cnt/5->중복 없는 수 5개 나올때마다 행이 하나씩 내려감.
		 * 0/5,1/5,2/5,3/5,4/5->0
		 * cnt%/5->중복 없는 수 1개 나올때마다 열이 하나씩 이동
		 * 0%5->0열, 1%5->1열, 2%5->2열...
		 * if 3X10 arr[].length = 5
		 * 1  2  3  4  5  6  7  8  9  10
		 * 11 12 13 14 15 16 17 18 19 20
		 * 21 22 23 24 25 26 27 28 29 30
		 * cnt/10-> 중복 없는 수 10개 나올때마다 행이 하나씩 내려감.
		 * cnt%10-> 중복 없는 수 1개 나올때마다 열이 하나씩 이동
		 */
		int cnt=0;
		while(cnt<25) {
			boolean exist = false;
			int num = (int)(Math.random()*25+1);
			a:for(int i=0; i<bingo.length;i++) {
				for(int j=0; j<bingo[i].length;j++) {
					if(bingo[i][j]==num) {
						exist = true;
						break a;
					}
				}
			}
			if(!exist) {
			bingo[cnt/bingo[0].length][cnt%bingo[0].length] = num;
			cnt++;
			}
		}
		for(int i=0; i<bingo.length;i++) {
			for(int j=0; j<bingo[i].length;j++) {
				System.out.print(bingo[i][j]+" ");
			}
			System.out.println();
		}
	}
}