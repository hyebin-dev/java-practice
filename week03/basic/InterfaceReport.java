package week03.basic;

public class InterfaceReport {

	public static void main(String[] args) {
		System.out.println("<인터페이스 계약과 다중 구현>");
//		B-4) 인터페이스 계약과 다중 구현
//		문제: `interface Printable { void print(); }`와
//		`interface Exportable { String format(); }`를 정의하고,
//		'Report`가 둘 다 `implements` 하도록 하라. `print()`는 `format()` 결과를 출력한다.
//		문제설명: 인터페이스는 행동 계약만 정의하며 여러 개를 동시에 구현할 수 있다.
//		구현체는 두 계약을 모두 만족해야 하며, 호출부는 인터페이스 타입으로 의존하면 유연성이 커진다.
//		힌트: `interface`, `implements`, 다중 인터페이스 구현, 업캐스팅(Report → Printable/Exportable).
		Printable p = new Report("Day1");
		p.print();

	}

}
// implements -> 계약을 이행하겠다고 선언
class Report implements Printable, Exportable {
	
	private String title;

	Report(String title){
		this.title = title;
	}

	@Override
	public String format() {
		return title;
	}

	@Override
	public void print() {
		System.out.println(format());
	}
	
}

// 인터페이스 -> 계약서
interface Printable { // 출력할 수 있어야함.
	void print();
	
}

interface Exportable { // 문자열로 표현할 수 있어야함.
	String format();
	
}