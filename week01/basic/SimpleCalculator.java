package week01.basic;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		System.out.println("<간단한 계산기 만들기>");
//		7단계(기초): 간단한 계산기 만들기
//		문제: 사용자로부터 두 개의 숫자와 하나의 연산자(+, -, *, /)를 입력받아 계산 결과를 출력하는
//		간단한 계산기 프로그램을 작성하세요.
//		힌트: switch문, 변수, input, 연산자
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요.>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println("연산자 +, -, *, /, % 중 하나를 입력하세요.>");
		String operator = scanner.next();
//		scanner.nextLine(); -> 문자열로 받고 싶다면 개행을 한 번 비워주고 받기
//		String operator = scanner.nextLine();
		
		switch(operator){
			case "+": 
				System.out.println("<덧셈>");
				System.out.println(num1+"+"+num2+"="+(num1+num2)); break;
			case "-": 
				System.out.println("<뺄셈>");
				System.out.println(num1+"-"+num2+"="+(num1-num2)); break;
			case "*": 
				System.out.println("<곱셈>");
				System.out.println(num1+"*"+num2+"="+(num1*num2)); break;
			case "/": 
				while(num2==0) {
					System.out.println("0으로 나눌 수 없습니다.");
					System.out.println("2번째 숫자를 다시 입력해주세요.>");
					num2 = scanner.nextInt();
				}
				System.out.println("<나눗셈>");
				System.out.println(num1+"/"+num2+"="+(double)num1/num2); break;
			case "%": 
				while(num2==0) {
					System.out.println("0으로 나눌 수 없습니다.");
					System.out.println("2번째 숫자를 다시 입력해주세요.>");
					num2 = scanner.nextInt();
				}
				System.out.println("<나머지>");
				System.out.println(num1+"%"+num2+"="+(double)num1%num2); break;
		}
		
		scanner.close();
	}

}