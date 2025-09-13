package week01.intermediate;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("<버블 정렬>");
//		15단계 (Hard): 배열 요소 정렬하기 (버블 정렬)
//		문제: 사용자로부터 5개의 정수를 입력받아 배열에 저장한 후,
//		'버블 정렬(Bubble Sort)' 알고리즘을 이용하여 
//		오름차순으로 정렬하고 결과를 출력하는 프로그램을 작성하세요.
//      '버블 정렬(Bubble Sort)': 이웃한 두 수 비교
//		힌트: 배열, 다중 for문, if문
		Scanner scanner = new Scanner(System.in);
		int [] num = new int [5];
		System.out.println("숫자 5개를 입력하세요.> ");
		
		// 사용자로부터 5개의 정수를 입력받아 배열에 저장
		for(int i=0; i<num.length; i++) {
			num[i] = scanner.nextInt();
		}
		
		// 이웃한 두 수 비교
		for(int i=0; i<num.length-1; i++) {
			int cnt = 0;
			for(int j=0;j<num.length-1-i;j++) {
			/* 한 회전마다 맨 끝 숫자는 고정
			 * ex)i=0 0개 고정 / i=1 1개 고정 / i=2 2개 고정...
			 * -> 비교해야할 개수 i개씩 줄음
			 * j+1개에 넣어야 하니까 -1
			 * => num.length-1-i
			 */	
			/* num.length=5
			 * i=0 j<4 -> 0 1 2 3
			 * i=1 j<3 -> 0 1 2 
			 * i=2 j<2 -> 0 1
			 * i=3 j<1 -> 0
			 */
			if(num[j]>num[j+1]){ 
				int tmp = num[j];
				num[j]=num[j+1];
				num[j+1]=tmp;
				cnt++;
				}
			}
			if(cnt==0) {
				break;
			}
		}
		for (int n : num) System.out.print(n + " ");
		
		scanner.close();
	}
}