package week01.basic;

import java.util.Scanner;

public class SumCalculator {
	
	public static void main(String[] args) {
		System.out.println("<두 정수의 합 계산하기>");
	// 3단계(기초): 두 정수의 합 계산하기
	// 문제: 사용자로부터 두 개의 정수를 입력받아 그 합을 계산하고 결과를 출력하는 프로그램을 작성하세요.
	// 힌트: 출력, 변수, input, 연산자, 자료형 변환
	Scanner scanner = new Scanner(System.in);
	System.out.println("두 정수를 입력하세요.>");
	int num1 = scanner.nextInt();
	int num2 = scanner.nextInt();
//	int sum = num1+num2;
//	System.out.println(num1+"+"+num2+"="+sum);
	System.out.println(num1+"+"+num2+"="+(num1+num2));
	scanner.close();
	}
}