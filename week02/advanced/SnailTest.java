package week02.advanced;

public class SnailTest {

	public static void main(String[] args) {
		System.out.println("<달팽이 배열 생성 클래스>");
//		29단계 (심화): 달팽이 배열 생성 클래스
//		문제: 1주차 21번 달팽이 배열 만들기를 클래스로 재설계하세요.
//		    1. SnailArray.java 클래스를 만듭니다.
//		    2. int[][] array를 멤버 변수로 가집니다.
//		    3. 생성자에서 배열의 크기 N을 받아 N x N 배열을 생성하고, 달팽이 모양으로 숫자를 채워 넣는
//		    로직을 수행합니다.
//		    4. 배열을 출력하는 print() 메서드를 구현합니다.
//		    SnailTest.java에서 SnailArray 객체를 생성하고 print()를 호출하여 결과를 확인하세요.
//		핵심 사고: 복잡한 알고리즘 로직 전체를 클래스의 생성자 또는 특정 메서드 안에 캡슐화하여 구현하는
//		능력을 기릅니다.
//		힌트: 클래스, 생성자, 멤버 변수(2차원 배열), 메서드, for문 또는 while문, if문
		System.out.println("--5 X 5 달팽이 배열--");
		SnailArray s = new SnailArray(5); // SnailArray 방법
		s.print();
		
		System.out.println();
		System.out.println("------------10 X 10 달팽이 배열------------");
		SnailArray2 s2 = new SnailArray2(10); // SnailArray2 방법
		s2.print();

	}

}
