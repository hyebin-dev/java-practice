package week03.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetMapTreeSetRange {

	public static void main(String[] args) {
		System.out.println("<Set/Map 종합: 중복 제거 + 빈도 맵 + TreeSet 범위>");
//		B-10) Set/Map 종합: 중복 제거 + 빈도 맵 + TreeSet 범위
//		문제: 정수 리스트에서 (1) `HashSet`으로 중복 제거하고,
//		(2) `Map<Integer,Integer>`로 **빈도수**를 계산하고(`put/getOrDefault`),
//		(3) 결과 키들을 `TreeSet`에 넣어 `first()/last()`와 `[start,end)` `subSet`을 구하라.
//		마지막으로 `keySet()/values()`를 한 번씩 순회해 합계를 확인하라.
//		문제설명: `Set`은 중복 제거/포함 판정에, `Map`은 키→값 집계에 최적이다.
//		정렬/범위 질의가 필요하면 `TreeSet`을 쓴다.
//		`subSet`은 좌폐우개 규칙이 기본이며, 경계가 컬렉션에 없을 수도 있음을 고려하라.
//		힌트: `HashSet`, `add`, `contains`, `clear`, `isEmpty`, `HashMap.put`,
//		`getOrDefault`, `keySet`, `values`, `TreeSet`, `first`, `last`, `subSet`,
//		`headSet`, `tailSet`(비교용), Wrapper/박싱(List), Iterator(선택: 순회 삭제 시).
        List<Integer> nums = Arrays.asList(5, 2, 7, 3, 3, 9, 1, 5, 6, 7, 2, 8, 10, 4, 0, 5, 9); // 리스트(중복 포함)
        System.out.println("원본 리스트: " + nums);

        Set<Integer> unique = new HashSet<>(nums); // 중복 제거
        System.out.println("중복 제거: " + unique);

        Map<Integer, Integer> freq = new HashMap<>(); // 빈도수 계산
        for (Integer n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        System.out.println("빈도수: " + freq);

        TreeSet<Integer> sorted = new TreeSet<>(freq.keySet()); // 정렬
        System.out.println("정렬: " + sorted);

        if (!sorted.isEmpty()) {
            int min = sorted.first(); // 맨 앞 키 값(가장 작은수) -> 정렬 후라서
            int max = sorted.last(); // 맨 뒤 키 값(가장 큰 수)
            System.out.println("맨 앞 원소: " + min + ", 마지막 원소: " + max);

            int start = 3; // 시작 할 위치
            int end = 8; // 끝 낼 위치
            SortedSet<Integer> range = sorted.subSet(start, end); // 3부터 8까지
            System.out.println(start + " <= x < " + end + " : " + range);

            System.out.println("처음부터 <= x < " + end + ": " + sorted.headSet(end)); // 처음부터 8까지
            System.out.println(start + "<= x <= 마지막까지 " + sorted.tailSet(start)); // 3부터 마지막까지
        }

        int keySum = 0;
        for (Integer k : freq.keySet()) keySum += k; // 키 값 합(중복 제외)
        System.out.println("키 합(중복 제외) : " + keySum);

        int valueSum = 0;
        for (Integer c : freq.values()) valueSum += c; // 원소 총 개수
        System.out.println("원소 총 개수(빈도 합) : " + valueSum + " , 원본 리스트 크기 : " + nums.size()); // 빈도 합 = 원본 리스트 크기
    }
}
