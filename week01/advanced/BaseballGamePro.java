package week01.advanced;

import java.util.Scanner;

public class BaseballGamePro {

	public static void main(String[] args) {
		System.out.println("<배열을 이용한 숫자 야구 게임>");
//		23단계 (심화): 배열을 이용한 숫자 야구 게임 완성하기
//		문제: 컴퓨터가 중복되지 않는 3개의 1~9 사이의 숫자를 생성합니다.
//		사용자가 3개의 숫자를 입력하여 맞출 때까지 게임을 진행하세요.
//		결과를 'S(스트라이크)', 'B(볼)'로 알려주고, 3S가 나오면 
//		몇 번 만에 맞췄는지 시도 횟수를 알려주고 게임을 종료합니다.
//		핵심 사고: 중복 없는 난수 생성 로직, 사용자의 입력과 
//		정답 배열을 비교하는 이중 for문 로직
//		힌트: `배열`, `while문` (난수 생성 및 게임 전체 루프),
//		`for문` (값 비교), `Math class`
		int[]comNum = new int[3];
		int [] userNum = new int[3];
		int strike=0;
		int ball=0;
		int cnt = 0;
		
		//컴퓨터가 중복되지 않는 3개의 1~9 사이의 숫자를 생성
		for(int i=0;i<comNum.length;i++) {
			comNum[i]=(int)(Math.random()*9+1);
			for(int j=0;j<i;j++) {
				if(comNum[i]==comNum[j]) {
					i--;
					break;
				}
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		while(strike!=3) {
			strike=0; ball=0;
				System.out.println("숫자 3자리를 입력하세요.> ");
					String num = scanner.nextLine();
					cnt++;
					String [] str = num.split("");
					for(int i=0;i<str.length;i++) {
						userNum[i] = Integer.parseInt(str[i]);
					}
			for(int i=0;i<comNum.length;i++) {
				for(int j=0;j<comNum.length;j++) {
					if(comNum[i]==userNum[j]&&i==j) {
						strike++;
					}
					else if(comNum[i]==userNum[j]&&i!=j) {
						ball++;
					}
					}
				}
			if(ball==0&&strike==0) {
				System.out.println("out!");
			}
			else {
				System.out.println(strike+"s"+ball+"b");
			}
			
		}
		System.out.println("3s! "+cnt+"번 만에 맞추셨습니다!");
		scanner.close();
	}
}