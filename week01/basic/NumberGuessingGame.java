package week01.basic;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		System.out.println("<숫자 맞추기 게임>");
//		6단계(기초): 숫자 맞추기 게임
//		문제: 프로그램이 1에서 100 사이의 임의의 숫자를 생성하고, 사용자가 그 숫자를 맞출 때까지 입력을 받는 프로그램을 작성하세요.
//		사용자가 입력한 숫자가 정답보다 크면 "더 작은 수입니다.", 작으면 "더 큰 수입니다."라고 힌트를 줍니다.
//		정답을 맞추면 "정답입니다!"를 출력하고 프로그램을 종료하세요.
//		힌트: while문, if문, break/continue, Math class, input
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.>");
		int userNum = scanner.nextInt();
		int comNum = (int)(Math.random()*100+1);
		
		while(userNum!=comNum) {
			while(userNum<1||userNum>100) {
				System.out.println("숫자를 잘못 입력하셨습니다.");
				System.out.println("1~100 사이의 숫자를 입력해주세요.>");
				userNum = scanner.nextInt();
			}
			if(userNum>comNum) {
				System.out.println("더 작은 수입니다.");
			}
			else if(userNum<comNum) {
				System.out.println("더 큰 수 입니다.");
			}
			System.out.println("다시 숫자를 입력해주세요.>");
			userNum = scanner.nextInt();
		}
		System.out.println("정답입니다!");
		scanner.close();
	}
}