package week03.basic;

import java.util.ArrayList;
import java.util.List;

public class AbstractShapeArea {

	public static void main(String[] args) {
		System.out.println("<추상 골격 제공 + 구현 클래스>");
//		B-3) 추상 골격 제공 + 구현 클래스
//		문제: `abstract class Shape { abstract double area(); }`를 만들고,
//		`Rectangle(w,h)`와 `Circle(r)`이 `area()`를 구현하도록 하라. 리스트에 담아 총 넓이를 구해보라.
//		문제설명: 추상 클래스는 공통 인터페이스(시그니처)를 강제하고, 하위 클래스가 구현 세부를 제공한다.
//		클라이언트는 상위 타입 `Shape`로 묶어 다룰 수 있고, 런타임에는 실제 타입의 `area()`가 호출된다(동적 바인딩).
//		힌트: `abstract class`, `abstract method`, `implements` 아님(클래스 상속), 리스트,
//		향상된 for, 다형성.
		Shape r1 = new Rectangle(8,7);
		Shape r2 = new Rectangle(5,2);
		Shape r3 = new Rectangle(9,3);
		
		Shape c1 = new Circle(4);
		Shape c2 = new Circle(6);
		
		List<Shape> list = new ArrayList<>();
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(c1);
		list.add(c2);
		
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		System.out.println("총 넓이: " + sum);

	}

}

abstract class Shape { // 추상 클래스(추상 메서드가 있으면 그 구현을 하위 클래스에 강제한다)
	abstract double area();
	}

class Rectangle extends Shape {
	private double width;
	private double height;
	
	Rectangle(double width, double height) { //생성자
		this.width = width;
		this.height = height;
	}
	
	@Override
	double area() { // 추상 메서드
		return width * height;
	}

}

class Circle extends Shape {
	private double r;
	
	Circle(double r) { //생성자
		this.r = r;
	}
	
	@Override
	double area() { // 추상 메서드
		return r * r * Math.PI;
	}
	
}