package week02.advanced;

import java.util.Arrays;

public class UtilTest {

	public static void main(String[] args) {
		System.out.println("<배열 유틸리티 클래스 만들기>");
//		25단계 (심화): 배열 유틸리티 클래스 만들기
//		문제: ArrayUtil.java 클래스를 만들고, 모든 메서드를 static으로 구현하세요.
//		    1. static int[] sort(int[] arr): 버블 정렬 알고리즘을 사용하여 배열을 오름차순으로
//		    정렬한 새로운 배열을 리턴합니다. (원본 배열은 변경하지 않음)
//		    2. static int search(int[] arr, int target): 정렬된 배열에서 target 값이 있는
//		    인덱스를 찾아 리턴합니다. 없으면 -1을 리턴합니다.
//		    UtilTest.java에서 정수 배열을 만들고, ArrayUtil의 메서드들을 호출하여 결과를 확인하세요.
//		핵심 사고: 특정 데이터에 종속되지 않고 기능만 제공하는 유틸리티성 클래스를 static 멤버만으로
//		구현하고, 메서드의 순수성(원본 데이터를 훼손하지 않음)을 이해합니다.
//		힌트: 모든 멤버가 static인 클래스, 배열, 이중 for문(버블정렬), return
		int [] arr = {3, 8, 3, 9, 7 , 4 , 3, 1, 9, 2, 4, 5, 0, 1, 2, 7, 4, 5};
		System.out.print("원본 배열: ");
		System.out.println(Arrays.toString(arr));
		System.out.print("정렬된 배열: ");
		System.out.println(Arrays.toString(ArrayUtil.sort(arr)));
		System.out.print("숫자 3이 존재하는 배열의 인덱스: ");
		System.out.println(ArrayUtil.search(ArrayUtil.sort(arr), 3));
		

	}

}
