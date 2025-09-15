package week02.intermediate;

public class PointTest {

	public static void main(String[] args) {
		System.out.println("<Point 클래스와 거리 계산 메서드>");
//		19단계(응용): Point 클래스와 거리 계산 메서드
//		문제: Point.java에 int x, y 좌표를 멤버 변수로 만드세요. 다른 Point 객체를 매개변수로 받아
//		현재 점과의 거리를 계산하여 double로 리턴하는 getDistance(Point other) 메서드를 구현하세요.
//		PointTest.java에서 두 Point 객체를 만들고 한 객체에서 getDistance를 호출하여 결과를 출력하세요.
//		핵심 사고: 클래스를 이용해 현실의 개념(좌표)을 모델링하고, 해당 객체들의 데이터를 이용해 연산하는 메서드를
//		클래스 내부에 구현합니다.
//		힌트: 클래스, 메서드, 객체를 매개변수로 전달, Math.sqrt, Math.pow, return
		Point p = new Point(0,0);
		Point p2 = new Point(8,6);
		
		double d = p.getDistance(p2);
		
		System.out.println("두 점 사이의 거리: " + d);
	}

}
