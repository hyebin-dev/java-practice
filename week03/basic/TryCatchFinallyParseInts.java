package week03.basic;

import java.util.ArrayList;
import java.util.List;

public class TryCatchFinallyParseInts {

	public static void main(String[] args) {
		System.out.println("<예외 기본: try/catch/finally 동작 확인>");
//		B-7) 예외 기본: try/catch/finally 동작 확인
//		문제: 문자열 배열에서 정수만 파싱해 리스트로 모으되, 숫자가 아니면 `NumberFormatException`을 잡아
//		건너뛰고, 마지막에 `finally`에서 `"done"`을 출력하라.
//		문제설명: `try` 블록에서 예외가 나면 곧바로 해당 타입의 `catch`로 흐름이 이동한다.
//		`finally`는 예외 발생과 관계없이 항상 실행된다. 이 패턴은 입력 정제에 자주 쓰인다.
//		힌트: `try { ... } catch (NumberFormatException e) { ... } finally { ... }`,
//		`ArrayList`.
		String [] str = {"8", "e", "com", "321", "no", "9", "k", "3", "hi", "93"};
		List<Integer>list = new ArrayList<>();
		
		try {
		for (int i =0; i < str.length; i++) {
			String trimStr = str[i].trim(); // 공백제거
				if (trimStr.isEmpty()) { // 비어있는 칸 조기종료
					continue;
				}		
				try {
				list.add(Integer.parseInt(trimStr));// 정수이면 list에 추가	
		} catch (NumberFormatException e) {	
		}
		}
		} finally {
			System.out.println("done");
		}
		System.out.println(list);
	}

}
