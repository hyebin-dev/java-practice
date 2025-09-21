package week03.basic;

public class ValidateAgeIllegalArgument {
	
	String outOfRange(int age){
		if(age < 0 || age > 150) {
			throw new IllegalArgumentException("0~150 범위를 벗어났습니다.");
		}
			return "OK";
	}	

	public static void main(String[] args) {
		System.out.println("<인자 검증: IllegalArgumentException 던지기>");
//		B-8) 인자 검증: IllegalArgumentException 던지기
//		문제: 나이 `age`가 0~150 범위를 벗어나면 `IllegalArgumentException`을 던지고(메시지 포함),
//		아니면 `"OK"`를 반환하는 메서드를 작성하라.
//		문제설명: 잘못된 입력(도메인 불변 위반)은 조기 실패가 원칙이다.
//		체크 예외보다 런타임 예외로 간단히 신호하는 것이 도메인 검증에 흔하다.
//		힌트: `if (age<0 || age>150) throw new IllegalArgumentException("...");`.
		ValidateAgeIllegalArgument vaa = new ValidateAgeIllegalArgument();
		System.out.println(vaa.outOfRange(25));
		System.out.println(vaa.outOfRange(200));
		
	}
	
}