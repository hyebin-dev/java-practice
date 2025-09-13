package week01.intermediate;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		System.out.println("<숫자 야구 게임>");
//		14단계(응용): 숫자 야구 게임
//		문제: 컴퓨터가 3자리의 임의의 숫자(각 자리수는 1~9, 중복 없음)를 생성합니다.
//		사용자는 3자리 숫자를 입력하여 컴퓨터가 생각한 숫자를 맞추는 게임을 만드세요.
//		    - 숫자와 위치가 모두 맞으면 '스트라이크(S)'
//		    - 숫자는 맞지만 위치가 틀리면 '볼(B)'
//		    - 모두 틀리면 '아웃'
//		    - 3S가 나오면 게임이 종료됩니다.
//		힌트: 배열, while문, for문, if문, Math class
		int ball = 0;
		int strike = 0;
		int[]comNum = new int[3];
		int [] userNum = new int[3];
		Scanner scanner = new Scanner(System.in);

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
		
		while(strike!=3) { // 3strike 나오기 전까지는 반복
			strike =0;
			ball = 0;
			System.out.println("숫자 3개를 입력해주세요.> ");
			// 사용자 번호(각 자리수는 1~9, 중복 없음) 받기
			for (int i = 0; i < userNum.length; i++) {
			    while (true) {
			        int num = scanner.nextInt();
			        // 1~9 사이 숫자인지 확인
			        if (num<1 || num>9) {
			            System.out.println("범위에 맞지 않는 번호입니다.");
			            System.out.print("중복 없는 1~9 사이의 숫자 3개를 다시 입력해주세요.> ");
			            continue;
			        }
			        // 중복인지 확인
			        int j = 0; //중복 발견해서 숫자 다시 받아오면 처음부터 검사할 수 있도록 매번 0으로 초기화
			        for (; j<i; j++) { //루프종료되면서 j++되서 j==i 상태로 나옴.
			            if (num == userNum[j]) break; // 중복 발견 시 바로 루프 탈출
			        }
			        if (j<i) { //중복 발견하자마자 나와서 j<i 상태(for문 끝까지 못돌았다는 뜻)->중복 숫자 있는지 확인하는 질문
			            System.out.println("중복된 숫자입니다.");
			            System.out.print("중복 없는 1~9 사이의 숫자 3개를 다시 입력해주세요.> ");
			            continue;
			        }
			        //j==i for문에서 끝까지 중복없이 나옴
			        userNum[i] = num; //1~9,중복X 확인 후 저장
			        break;
			    }
			}
		// 숫자 비교
		for(int i=0;i<comNum.length; i++) {
			for(int j=0; j<userNum.length;j++) {
				if(comNum[i]==userNum[j]&&i==j) {
					strike++;// 자리까지 같으면 strike
					break;
				}
					else if(comNum[i]==userNum[j]&&i!=j){ // 자리는 다르면 ball
						ball++;
						break;
					}
					}
				}
		if(strike==0&&ball==0) {
			System.out.println("out");
		}
		else {
			System.out.println(strike+"s"+ball+"b");
		}
	}
		
		System.out.println(strike+"s! 정답입니다.");
		
		scanner.close();
	}
}