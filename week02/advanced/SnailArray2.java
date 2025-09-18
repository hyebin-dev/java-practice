package week02.advanced;

public class SnailArray2 {
	
	int[][] array;
	
	SnailArray2(int N){
		array = new int [N][N];
		
		int top = 0; int bottom = N-1;
		int left = 0; int right = N-1;
		int cnt = 0;
		
		while (cnt < N * N) {
		if (cnt < N * N && top <= bottom) { // 행 체크용
			for (int i = left; i <= right; i++) { // 오른쪽으로 이동
				array[top][i] = cnt++;
			}
			top++;
		}
		if (cnt < N * N && left <= right) { // 열 체크용
			for (int i = top; i <= bottom; i++) { // 아래로 이동
				array[i][right] = cnt++;
			}
			right--;
		}
		if (cnt < N * N && top <= bottom) { // 행 체크용
			for (int i = right; i >= left; i--) { // 왼쪽으로 이동
				array[bottom][i] = cnt++;
			}
			bottom--;
		}	
		if (cnt < N * N && left <= right) { // 열 체크용
			for (int i = bottom; i >= top; i--) { // 위로 이동
				array[i][left] = cnt++;
			}
			left++;
		}
		}
	}
	
	void print() {
		int width = String.valueOf(array.length * array.length).length();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%" + width + "d " , array[i][j]);
			}
			System.out.println();
		}
	}

}

//29단계 (심화): 달팽이 배열 생성 클래스
//문제: 1주차 21번 달팽이 배열 만들기를 클래스로 재설계하세요.
//    1. SnailArray.java 클래스를 만듭니다.
//    2. int[][] array를 멤버 변수로 가집니다.
//    3. 생성자에서 배열의 크기 N을 받아 N x N 배열을 생성하고, 달팽이 모양으로 숫자를 채워 넣는
//    로직을 수행합니다.
//    4. 배열을 출력하는 print() 메서드를 구현합니다.
//    SnailTest.java에서 SnailArray 객체를 생성하고 print()를 호출하여 결과를 확인하세요.
//핵심 사고: 복잡한 알고리즘 로직 전체를 클래스의 생성자 또는 특정 메서드 안에 캡슐화하여 구현하는
//능력을 기릅니다.
//힌트: 클래스, 생성자, 멤버 변수(2차원 배열), 메서드, for문 또는 while문, if문
