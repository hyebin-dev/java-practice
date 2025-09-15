package week02.intermediate;

public class Circle {
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	double getArea() {
		return radius*radius*3.14;
	}
	
	double getCircumference() {
		return 2*radius*3.14;
	}

	public static void main(String[] args) {
//		11단계(응용): Circle 클래스 설계
//		문제: Circle.java에 반지름 radius를 private double 멤버 변수로 만드세요.
//		생성자에서 반지름을 초기화하고, 원의 넓이를 계산하여 리턴하는 getArea()와 원의 둘레를 계산하여
//		리턴하는 getCircumference() 메서드를 모두 구현하세요. (원주율 = 3.14)
//		핵심 사고: 하나의 클래스에 여러 데이터와 관련 기능들을 함께 묶어 관리하는 객체 지향의 기본을 연습합니다.
//		힌트: 클래스, private, 생성자, 메서드, 리턴타입, double, 연산자
	}
}
