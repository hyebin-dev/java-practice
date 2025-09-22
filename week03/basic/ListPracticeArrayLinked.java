package week03.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListPracticeArrayLinked {

	public static void main(String[] args) {
		System.out.println("<List 실습: ArrayList ↔ LinkedList, 정렬·탐색>");
//		B-9) List 실습: ArrayList ↔ LinkedList, 정렬·탐색
//		문제: 문자열 배열을 `Arrays.asList`로 감싼 뒤,
//		(1) 수정 가능한 `ArrayList`로 복사하고,
//		(2) `addAll`로 다른 리스트를 합치고,
//		(3) `Collections.sort`로 정렬하고,
//		(4) `indexOf/contains/size/isEmpty`를 점검한 다음,
//		(5) `LinkedList`로 변환하여 맨 앞/뒤에 원소를 추가하고 제거하라.
//		문제설명: `Arrays.asList`는 크기 고정이라 `add/remove`가 불가하다.
//		수정이 필요하면 새 `ArrayList`를 만든다. `LinkedList`는 양끝 삽입/삭제에 유리하다.
//		각 메서드가 반환/효과를 어떻게 주는지 확인하라.
//		힌트: `Arrays.asList`, `new ArrayList<>(...)`, `addAll`, `Collections.sort`,
//		`indexOf`, `contains`, `size`, `isEmpty`, `new LinkedList<>(list)`.
		String [] arr = {"Hi", "JAVA", "NEW", "practice", "project", "BYE", "java"};
		
		List<String> fixed = Arrays.asList(arr); // 고정 리스트 (크기 고정: add/remove 불가, set은 가능)
		System.out.println("고정 리스트 : " + fixed);
		
		List<String> list = new ArrayList<>(Arrays.asList(arr)); // 가변 리스트 (add/remove/set 가능)
		System.out.println("가변 리스트 : " + list);
		
        List<String> extra = Arrays.asList("python", "backend"); // 다른 리스트 만들기
        System.out.println("합 칠 리스트 : " + extra);
        list.addAll(extra); // 합치기
        System.out.println("다른 리스트와 합치기 : " + list);
        
        Collections.sort(list); // 정렬(오름차순)
        System.out.println("정렬 list : " + list);
        
        int idxJava = list.indexOf("java"); // indexOf
        System.out.println("java 인덱스 번호 : " + idxJava);
        
        boolean hasHi = list.contains("Hi"); // contains
        System.out.println("Hi 존재 여부 : " + hasHi);
        boolean hasBye = list.contains("Bye"); // 대소문자 구분
        System.out.println("Bye 존재 여부 : " + hasBye);
        
        int n = list.size(); // size
        System.out.println("list 내용 개수 : " + n);
        
        boolean empty = list.isEmpty(); // isEmpty
        System.out.println("list 비어있는지 : " + empty);

        // LinkedList -> 맨앞 맨뒤 원소를 자주 변경하는 경우 사용
        LinkedList<String> dq = new LinkedList<>(list); // list와 서로 영향 X
        System.out.println("LinkedList : " + dq);

        dq.addFirst("START");
        dq.addLast("LAST");
        System.out.println("맨 앞, 맨 뒤 원소 추가 후 : " + dq);

        String first = dq.getFirst();
        String last = dq.getLast();
        System.out.println("맨 앞 원소 : " + first);
        System.out.println("맨 뒤 원소 : " + last);

        String removedFirst = dq.removeFirst();
        String removedLast = dq.removeLast();
        System.out.println("제거할 맨 앞 원소 : " + removedFirst);
        System.out.println("제거할 맨 뒤 원소 : " + removedLast);
        System.out.println("제거 후 리스트 : " + dq);
        
	}

}