package week01.intermediate;

public class BingoBoardGenerator {

	public static void main(String[] args) {
		System.out.println("<빙고 게임 판 만들기 및 숫자 확인>");
//		20단계(응용): 빙고 게임 판 만들기 및 숫자 확인
//		문제: 5x5 빙고 판을 1부터 25까지의 숫자로 무작위로 채웁니다(숫자 중복 X).
//		그 후 사용자로부터 숫자를 하나씩 입력받아, 빙고 판에서 해당 숫자를 찾아 'X'로 바꾼 뒤 
//		매번 빙고 판을 다시 출력해주세요. 이 과정을 5번 반복합니다.
//		힌트: 다중 배열, Math class(숫자 섞기), for문, if문, input
		int [][] bingo = new int[5][5];
		
		// 방법 1: 1차원 배열에 넣고 섞어서 2차원 배열로 옮기기
		 /* 중요 포인트 >
		  * (int)(Math.random()*(i+1)) 
		  * Math.random() -> 0<=num<1
		  * i=0->0<=~<1 i=1->0<=~<2....i=24->0<=<25
		  * 앞에서부터 뽑으면 i=0부터니까 랜덤수는 0만 나옴
		  * 뒤에서부터 뽑으면 i=24부터니까 랜덤수는 0~24까지 나옴
		  * i=23이면 0~23까지 나와서 더이상 arr[24]는 나오지 않고 고정
		  * */
		int [] arr = new int [25];
		int k=0;
		for(int i=0; i<arr.length;i++) {
			arr[i] = i+1; // 1차원 배열에 1~25숫자 저장
		}
		for(int i=arr.length-1; i>=0;i--) { //랜덤 인덱스 뽑아서 해당 배열과 교환
			int tmp = arr[i];
			int index = (int)(Math.random()*(i+1)); 
			int tmp2 = arr[index];
			arr[index] = tmp;
			arr[i] = tmp2;
		}
		for(int i=0; i<bingo.length;i++) {
			for(int j=0; j<bingo[i].length;j++) {
//				bingo[i][j] = arr[i * 5 + j]; //(1차원->2차원)방법1: 행*col + 열
				//(i, j)에 도달하려면, i행에 col칸씩 있으니까
				//i개 행을 지나가면 i*col만큼 가야함 j는 그 행에 칸 수 
				bingo[i][j] = arr[k]; //(1차원->2차원)방법2: 포인터로 단순계산
				k++;
				System.out.print(bingo[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
