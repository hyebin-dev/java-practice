package week02.basic;

public class AdderTest {

	public static void main(String[] args) {
		System.out.println("<두 수의 합을 리턴하는 메서드>");
//		5단계(기초): 두 수의 합을 리턴하는 메서드
//		문제: Adder.java 클래스에 두 개의 int를 매개변수로 받아 그 합을 리턴하는 
//		add(int a, int b) 메서드를 만드세요. AdderTest.java에서 이 메서드를 호출하고,
//		리턴된 값을 변수에 저장한 후 출력하여 확인하세요.
//		핵심 사고: 메서드가 특정 값을 계산하여 호출한 곳으로 되돌려주는 return의 개념을 학습합니다.
//		힌트: 클래스, 메서드, 매개변수, 리턴타입, return, 객체화, 변수
		Adder a = new Adder();
		int sum = a.add(3, 5);
		System.out.println(sum);
	}
}
