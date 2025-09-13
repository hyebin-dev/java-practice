package week01.intermediate;

import java.util.Scanner;

public class DiamondPattern2 {

	public static void main(String[] args) {
		System.out.println("<다이아몬드 별 찍기2>");
//		11단계(응용): 별찍기 - 다이아몬드
//		문제: 사용자로부터 홀수 `N`을 입력받아, 높이가 `N`인 다이아몬드 모양을 별()로 출력하는 프로그램을 작성하세요.
//		힌트: for문, if문, 변수, input
		//        *           ->1 (공백3)
		//       ***          ->3 (공백2)
		//      *****         ->5 (공백1)
		//     *******        ->7 (공백0)
		//      *****
		//       ***
		//        *
		// 1, 3, 5, 7 -> N=7
		// 1 3 5 7 5 3 1
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.>");
		int N = scanner.nextInt();
		
		while(N<=0||N%2==0) {
			System.out.println("숫자를 잘못 입력하셨습니다.");
			System.out.println("1 이상의 홀수를 입력해주세요.>");
			N = scanner.nextInt();
		}
		for(int i=1;i<=N/2+1;i++) {
			// i=1 공백3 별1
			// i=2 공백2 별3
			// i=3 공백1 별5
			// i=4 공백0 별7
		System.out.println(" ".repeat(N/2+1-i)+"*".repeat(2*i-1));
		
		}
		for(int i=N/2+2;i<=N;i++) {
			// i=5 공백1 별5
			// i=6 공백2 별3
			// i=7 공백3 별1
			System.out.println(" ".repeat(i-(N/2+1))+"*".repeat(2*(N-i)+1));
		}
		scanner.close();
	}
}