package week01.basic;


import java.util.Scanner;


public class EvenOrOdd {


	public static void main(String[] args) {
		System.out.println("<짝수/홀수 판별하기>");
//		4단계(기초): 짝수/홀수 판별하기
//		문제: 사용자로부터 정수 하나를 입력받아 그 수가 짝수인지 홀수인지 판별하여 출력하는 프로그램을 작성하세요.
//		힌트:if문, 변수, input, 연산자
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 하나를 입력하세요.>");
		int num = scanner.nextInt();
		if(num%2==0) {
			System.out.println(num+"은(는) 짝수입니다.");
		}
		else {
			System.out.println(num+"은(는) 홀수입니다.");
		}
		scanner.close();
	}
}