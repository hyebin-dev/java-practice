package week01.intermediate;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		System.out.println("<소수(Prime Number) 판별기>");
//		13단계(응용): 소수(Prime Number) 판별기
//		문제: 사용자로부터 1보다 큰 정수 하나를 입력받아, 그 수가 소수인지 아닌지를 판별하여 
//		출력하는 프로그램을 작성하세요. 
//		(소수는 1과 자기 자신으로만 나누어지는 수입니다.)
//		힌트: for문, if문, break, 변수, input
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 1개를 입력하세요.>");
		int num = scanner.nextInt();
		int cnt = 0;
		
		while(num<=1) {
			System.out.println("숫자를 잘못 입력하셨습니다.");
			System.out.println("1보다 큰 정수 하나를 입력해주세요.>");
			num = scanner.nextInt();
		}
		// 2-> 1,2 3->1,3 4->1,2,4 5->1,5
		// 나눠지는 수가 2개
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				cnt++;
			}
			if(cnt>2) { //나눠지는 수가 2개 초과로 나오면 조기 종료
				break;
			}
		}
		if(cnt==2) {
			System.out.println(num+"은(는) 소수입니다.");
		}
		else {
			System.out.println(num+"은(는) 소수가 아닙니다.");
		}
		scanner.close();
	}

}
