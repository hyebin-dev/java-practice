package week01.basic;

import java.util.Scanner;

public class CountCharacter {

    public static void main(String[] args) {
    	System.out.println("<문자 등장 횟수 세기>");
        // 9단계(기초): 문자 등장 횟수 세기 (대소문자 무시)
        // 문제: 사용자로부터 문자열과 한 글자를 입력받아,
        //      문자열에서 해당 글자가 몇 번 등장하는지 출력하는 프로그램을 작성하세요.
        //      (예: 문자열 "Hello World", 문자 'l' -> 3)
        // 힌트: String length(), charAt(), toLowerCase(), trim(), for문
    	// trim() : 불필요한 공백 제거
    	// toLowerCase() / toUpperCase() : 대소문자 변환
    	// charAt(index) : index 번지에 있는 문자를 반환 char
    	int cnt = 0;
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("문자열을 입력해주세요.> ");
    	String str = scanner.nextLine();
    	System.out.println("한 글자를 입력해주세요.> ");
    	String ch = scanner.nextLine();
    	String newStr = str.trim().toLowerCase();
    	
    	for(int i = 0; i < newStr.length(); i++) {
    		if(newStr.charAt(i) == ch.trim().toLowerCase().charAt(0)) {
    			cnt++;
    		}
    	}
    	System.out.println(ch+"는 총 "+cnt+"번 등장합니다.");
    	scanner.close();
    }

}

