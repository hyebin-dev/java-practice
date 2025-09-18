package week02.advanced;

public class MathUtil {
	
	static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	

	public static void main(String[] args) {
		System.out.println("<재귀 호출을 이용한 피보나치 수열>");
//		28단계 (심화): 재귀 호출을 이용한 피보나치 수열
//		문제: MathUtil.java 클래스에 숫자를 하나 받아 피보나치 수열의 n번째 항을 리턴하는
//		static int fibonacci(int n) 메서드를 구현하세요. 단, for문이나 while문이 아닌 재귀 호출을
//		사용해야 합니다. (F(n) = F(n-1) + F(n-2), F(1)=1, F(2)=1)
//		핵심 사고: 반복문을 클래스의 메서드와 재귀 호출로 해결하는 다른 접근법을 경험합니다.
//		힌트: 재귀 호출, static 메서드, if문 (종료 조건), return
		System.out.println("F(0): " + fibonacci(0));
		System.out.println("F(1): " + fibonacci(1));
		System.out.println("F(8): " + fibonacci(8));
		System.out.println("F(15): " + fibonacci(15));
	}

}
