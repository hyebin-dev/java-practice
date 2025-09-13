package week01.advanced;

import java.util.Scanner;

public class StringCompressor {

	public static void main(String[] args) {
		System.out.println("<문자열 압축하기>");
//		22단계 (심화): 문자열 압축하기
//		문제: 사용자로부터 문자열을 입력받아,
//		같은 문자가 연속으로 반복될 경우 그 문자 바로 뒤에 반복 횟수를 붙여 
//		압축하는 프로그램을 작성하세요.
//		(예: "AAABBCDDDD" -> "A3B2C1D4")
//		핵심 사고: 연속되는 문자를 세고, 문자가 바뀔 때 이전까지의 정보를 처리하는 로직
//		힌트: `String class`, `for문`, `if문`, `문자 비교`, `횟수 카운트 변수`
		int cnt=1;
		String compressed="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.> ");
		String text = scanner.nextLine();
		char [] ch = text.toCharArray();
		
		for(int i=0; i<text.length()-1;i++) {
			if(ch[i]==ch[i+1]) {
				cnt++;
			}
			else { //마지막 변경때는 문자가 바뀌지 않아서 여기로 오지 않음.
				compressed += ch[i]+String.valueOf(cnt);
				cnt=1;
			}
		}
		if (ch.length > 0) { //빈문자열,공백 방지
		    compressed += ch[ch.length - 1] + String.valueOf(cnt); 
		    //배열 마지막 자리->ch.length-1 마지막 글자는 반복문 끝나고 따로 넣어주기
		}
		System.out.println(compressed);
		scanner.close();
	}
}