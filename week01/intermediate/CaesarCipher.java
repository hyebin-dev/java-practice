package week01.intermediate;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		System.out.println("<간단한 암호화/복호화 프로그램>");
//		17단계(응용): 간단한 암호화/복호화 프로그램
//		문제: 사용자로부터 문자열과 정수 `key` 값을 입력받습니다.
//		문자열의 각 알파벳을 `key` 값만큼 뒤로 밀어서 암호화된 문자열을 만드는
//		'카이사르 암호' 프로그램을 작성하세요.
//		(예: 'abc', key 3 -> 'def')
//		힌트: String class, char 자료형, for문, 자료형 변환
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.>");
		String text = scanner.nextLine();
		System.out.println("key 값을 입력하세요.>");
		int key = scanner.nextInt();
		String code="";
		
		for(int i=0; i<text.length();i++) {
			char ch = text.charAt(i); // 문자 하나씩 나누기
			if(Character.isUpperCase(ch)) { // 대문자
				char ch2 = (char)('A'+(ch-'A'+key)%26);
				code+=ch2;
			}
			else if(Character.isLowerCase(ch)) { // 소문자
				char ch2 = (char)('a'+(ch-'a'+key)%26);
				code+=ch2;
			}
			else { // 알파벳 아닌 것
				code+=ch;
			}
		}
		System.out.println(code);
		
//			int num = (int)text.charAt(i); // 바로 숫자로 바꾸면 대문자 소문자 구별 X
//			
//			num += key;
//			if(num%26==0) { // 시작 알파벳인 A나 a를 빼고 나눠야 다시 처음으로 돌아감.
//				num = num%26;
//			}		
//			char code = (char)num;
//			} else {
//			    System.out.println(text.charAt(i));
//			}
//		}
		scanner.close();
	}
}