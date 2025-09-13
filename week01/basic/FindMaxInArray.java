package week01.basic;

public class FindMaxInArray {

	public static void main(String[] args) {
		System.out.println("<배열에서 가장 큰 수 찾기>");
//		8단계(기초): 배열에서 가장 큰 수 찾기
//		문제: 5개의 정수를 배열에 저장한 후, 배열의 모든 요소를 확인하여 가장 큰 수를 찾아 출력하는 프로그램을 작성하세요.
//		힌트: 배열, for문, if문
		int[] num = {53,6,70,35,42};
		int max = 0;
		
		for(int i=0; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}
		System.out.println("최고값:"+max);
	}
}