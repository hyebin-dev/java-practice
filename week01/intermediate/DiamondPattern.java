package week01.intermediate;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		System.out.println("<다이아몬드 별 찍기>");
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
		for(int i=1; i<=N/2;i++) {
			// 1 2 3 4...N/2
			// if N=7 -> 1 2 3
			for(int j=N/2; j>=i; j--) {
				// i=1 j>=1 3 2 1
				// i=2 j>=2 3 2
				// i=3 j>=3 3
			System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				// i=1 j<=1 1
				// i=2 j<=3 1 2 3 
				// i=3 j<=5 1 2 3 4 5
				System.out.print("*");
			}System.out.println();
		}
		for(int i=N/2+1;i<=N;i++) {
			// 4 5 6 7
			for(int j=1; j<=i-(N/2+1); j++) {
				// i=4 j<=4-4=0 
				// i=5 j<=5-4=1 1
				// i=6 j<=6-4=2 1 2  
				// i=7 j<=7-4=3 1 2 3
			System.out.print(" ");
			}
			for(int j=N; j>=2*i-N; j--) {
				// i=4 j>=2*4-7=1 7 6 5 4 3 2 1
				// i=5 j>=2*5-7=3 7 6 5 4 3
				// i=6 j>=2*6-7=5 7 6 5
				// i=7 j>=2*7-7=7 7
				System.out.print("*");  
			}System.out.println();
		}
		scanner.close();
	}
}