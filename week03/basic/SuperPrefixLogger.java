package week03.basic;

public class SuperPrefixLogger {

	public static void main(String[] args) {
		System.out.println("<super 재사용: 기본 동작 + 추가 문구>");
//		B-2) super 재사용: 기본 동작 + 추가 문구
//		문제: `BaseLogger.log(String msg)`는 `msg`를 반환한다. `PrefixLogger`는 이를 상속받아,
//		먼저 `super.log(msg)`를 호출한 뒤 결과 앞에 `"[PREFIX] "`를 붙여 반환하라.
//		문제설명: 자식이 부모의 기본 동작을 활용하고 싶을 때 `super`로 부모 메서드를 호출한다.
//		이 패턴은 행동 확장(decorate) 예시다. 동일 시그니처를 유지하므로 클라이언트 코드는
//		자식 객체를 부모 타입으로 다뤄도 동작이 교체된다(다형성).
//		힌트: 상속, `@Override`, `super.log(...)`, 다형성(업캐스팅).
		BaseLogger b = new BaseLogger();
		System.out.println(b.log("접두사"));
		
		PrefixLogger p = new PrefixLogger();
		System.out.println(p.log("접두사"));	
	}

}

class BaseLogger{
	String log(String msg) {
	return msg;
	}
}

class PrefixLogger extends BaseLogger {

	@Override
	String log(String msg) {
		String pre = "[PREFIX] ";
		return pre + super.log(msg);
	}
	
}