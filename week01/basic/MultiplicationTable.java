package week01.basic;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
//		5단계(기초): 구구단 출력하기
//		문제: 사용자로부터 2에서 9 사이의 숫자를 입력받아 해당하는 단의 구구단을 출력하는 프로그램을 작성하세요.
//		힌트: for문, 변수, input, 출력
		System.out.println("<구구단 출력하기>");
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.>");
		int num = scanner.nextInt();
		while(num<2||num>9) {
			System.out.println("숫자를 잘못 입력하셨습니다.");
			System.out.println("2~9 사이의 숫자를 입력해주세요.>");
			num = scanner.nextInt();
			}
		System.out.println("<"+num+"단>");
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
		scanner.close();
	}
}