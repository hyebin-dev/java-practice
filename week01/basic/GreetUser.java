package week01.basic;

import java.util.Scanner;

public class GreetUser {
	
	public static void main(String[] args) {
		System.out.println("<이름 입력 받고 인사하기>");
	// 2단계(기초): 이름 입력받고 인사하기
	// 문제: 사용자로부터 이름을 입력받아 "안녕하세요,[이름]님!"
	// 과 같이 인사하는 메시지를 출력하는 프로그램을 작성하세요.
	// 힌트: 출력, 변수, input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.>");
		String name = scanner.nextLine();
		System.out.println("안녕하세요, "+name+"님!");
		scanner.close();
	}

}