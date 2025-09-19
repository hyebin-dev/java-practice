package week03.basic;

public class OverrideMessagePrinter {

	public static void main(String[] args) {
		System.out.println("<오버라이드로 출력 포맷 바꾸기>");
//		B-1) 오버라이드로 출력 포맷 바꾸기
//		문제: `MessagePrinter`의 `print(String msg)`는 `msg`를 그대로 반환한다.
//		`TimestampPrinter`가 이를 상속받아 `print`를 오버라이드하여 `"[INFO] msg"` 형태로 반환하도록 고쳐라.
//		테스트용으로 부모/자식 인스턴스를 각각 만들어 호출해보라.
//		문제설명: 오버라이드는 메서드 시그니처(리턴타입/이름/매개변수)를 동일하게 유지한 채 구현만 바꾸는 것이다.
//		자식에서 부모의 메서드와 동일한 시그니처로 선언하고 `@Override`를 붙이면 컴파일 타임에 검증된다.
//		`this`는 현재 인스턴스를 가리키며, 필요하면 `super.print(msg)` 결과를 조합할 수도 있다.
//		힌트: `class A { String print(...) }`, `class B extends A`, `@Override`, `super`
//		,`this`, 다형성(부모 타입 변수로 자식 참조 저장 가능).
		MessagePrinter mp = new MessagePrinter();
		System.out.println(mp.print("Hello"));
		
		TimestampPrinter tp = new TimestampPrinter();
		System.out.println(tp.print("Hello"));

	}

}

class MessagePrinter {
	
	String print(String msg){
	return msg;
}
	
}

class TimestampPrinter extends MessagePrinter{

	@Override
	String print(String msg) {
		String info = "[INFO] ";
		return info + super.print(msg);
	}	
	
}