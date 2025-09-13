package week01.intermediate;

import java.util.Scanner;

public class GcdCalculator {

	public static void main(String[] args) {
		System.out.println("<최애공약수(GCD)구하기>");
//		12단계(응용): 최대공약수(GCD) 구하기
//		문제: 사용자로부터 두 개의 양의 정수를 입력받아, 
//		유클리드 호제법을 이용하여 두 수의 최대공약수를 구하는 프로그램을 작성하세요.
//		유클리드 호제법: 큰 수 a, 작은 수 b가 있을 때
//		a를 b로 나눈 나머지 r을 구하고,
//		이제 문제를 (a, b) → (b, r) 로 바꿔서 반복했을때
//		나머지가 0이 되는 순간의 나누는 수가 최대공약수입니다.
//		힌트: while문, 변수, input, 연산자
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요.>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		while(a<=0||b<=0) {
			System.out.println("숫자를 잘못 입력하셨습니다.");
			System.out.println("양의 정수 2개를 입력해주세요.>");
			a = scanner.nextInt();
			b = scanner.nextInt();
		}
		// 6 24 -> 24%6=0 => 6
		// 36 48 -> 48%36=12 36%12=0 => 12
		//         a % b = r  b % r
		// a b -> a%b=r 
			while(b!=0) {
				// a%b=r
				int r = a%b; //if r=0 GCD:b
				a = b; // a->b
				b = r; // b->r
			}
			
		System.out.println("최대공약수:"+a);
	
		scanner.close();
	}

}