package week01.advanced;

import java.util.Scanner;

public class FindMode2 {

	public static void main(String[] args) {
		System.out.println("<배열에서 최빈값2(가장 자주 나온 수)>");
//		25단계 (심화): 배열에서 최빈값(가장 자주 나온 수) 찾기
//		문제: 정수가 들어있는 배열에서 가장 많이 등장하는 숫자를 찾는 프로그램을 작성하세요.
//		만약 최빈값이 여러 개라면 그중 아무거나 하나만 출력하면 됩니다.
//		핵심 사고: 각 숫자가 몇 번 나왔는지 효율적으로 세는 방법. 
//		(힌트: 또 다른 배열을 카운팅 용도로 사용)
//		힌트: `배열`, `이중 for문`, `카운팅을 위한 변수 또는 배열`
		int [] cnt = new int[10]; // 0~9까지만 비교가능
		int maxCnt = 0;
		int maxNum = 0;

		//숫자를 원하는 개수만큼 넣을 수 있음.
		Scanner scanner = new Scanner(System.in);
		System.out.println("0~9 사이의 숫자를 원하는만큼 입력하세요.>");
		System.out.println("(*띄어쓰기로 숫자를 구분하여 주세요.*)");
		String inputNum = scanner.nextLine();
		String [] str =  inputNum.split(" ");
		int [] num = new int[str.length];
		
		for(int i=0; i<str.length;i++) {
			num[i] = Integer.parseInt(str[i]);	
		}
		
		for(int i=0; i<num.length;i++) {
			cnt[num[i]]++;
			if(cnt[num[i]]>maxCnt) {
				maxCnt = cnt[num[i]];
				maxNum = num[i];
			}
		}
		System.out.println("최빈값 "+maxNum+"은(는) "+maxCnt+"번 나왔습니다.");
		scanner.close();
	}
}