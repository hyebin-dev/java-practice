package week02.advanced;

public class SnailArray {
	
	int[][] array;

	SnailArray(int N){
		array = new int [N][N];
		
		int x = 0, y = 0, dir = 0;
		int [] dx = {0, 1, 0, -1}; // 행(오른쪽 아래 왼쪽 위)
		int [] dy = {1, 0, -1, 0}; // 열(오른쪽 아래 왼쪽 위)
		
		for (int i = 0; i < N * N; i++) {
			array[x][y] = i+1;
			
			int nx = x + dx[dir]; // 다음 행
			int ny = y + dy[dir]; // 다음 열
			
			boolean outOfRange = (nx < 0 || nx >= N || ny < 0 || ny >= N); // 범위밖
			boolean filled = (!outOfRange && array[nx][ny] != 0); // 이미 채워진 칸
			
			if (outOfRange || filled) {
				dir = (1 + dir) % 4; // 4방향
				nx = x + dx[dir];
				ny = y + dy[dir];
			}
			x = nx; y = ny; //위치 갱신
		}
	}
	
	void print() {
		int width = String.valueOf( array.length * array.length ).length(); // 칸 수 = 문자 개수
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%" + width + "d ", array[i][j]);
			}
			System.out.println();
		}				
		
	}
	
//	29단계 (심화): 달팽이 배열 생성 클래스
//	문제: 1주차 21번 달팽이 배열 만들기를 클래스로 재설계하세요.
//	    1. SnailArray.java 클래스를 만듭니다.
//	    2. int[][] array를 멤버 변수로 가집니다.
//	    3. 생성자에서 배열의 크기 N을 받아 N x N 배열을 생성하고, 달팽이 모양으로 숫자를 채워 넣는
//	    로직을 수행합니다.
//	    4. 배열을 출력하는 print() 메서드를 구현합니다.
//	    SnailTest.java에서 SnailArray 객체를 생성하고 print()를 호출하여 결과를 확인하세요.
//	핵심 사고: 복잡한 알고리즘 로직 전체를 클래스의 생성자 또는 특정 메서드 안에 캡슐화하여 구현하는
//	능력을 기릅니다.
//	힌트: 클래스, 생성자, 멤버 변수(2차원 배열), 메서드, for문 또는 while문, if문

}
