package week01.intermediate;

import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		System.out.println("<문자열에 포함된 단어 수 세기>");
//		16단계(응용): 문자열에 포함된 단어 수 세기
//		문제: 사용자로부터 공백을 포함한 영어 문장을 입력받습니다.
//		문장에 총 몇 개의 단어가 있는지 계산하여 출력하는 프로그램을 작성하세요.
//		(단, 단어는 공백으로 구분됩니다.)
//		힌트: String class(`split()` 또는 `charAt()`과 `for`문 활용), input
//		System.out.println(str.charAt(2));, 
//		String[] strArr = str.split(", ");
//		System.out.println(strArr[2]);
		int cnt=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("영어 문장을 입력하세요.>");
		String enText = scanner.nextLine();
		
		// I"m so tired. -> 3 words
		String[] enTexts = enText.split(" "); // split() 이용
		
		for(int i=0; i<enText.length(); i++) { // charAt()과 for문 이용
			if(enText.charAt(i) == ' ') {
				cnt++;
			}
		}
		
		System.out.println("총 "+enTexts.length+"개의 단어가 있습니다.");	
		System.out.println("총 "+(cnt+1)+"개의 단어가 있습니다.");
		
		scanner.close();
	}

}