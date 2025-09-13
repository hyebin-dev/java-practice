package week01.advanced;

public class FindMode {

	public static void main(String[] args) {
		System.out.println("<배열에서 최빈값(가장 자주 나온 수)>");
//		25단계 (심화): 배열에서 최빈값(가장 자주 나온 수) 찾기
//		문제: 정수가 들어있는 배열에서 가장 많이 등장하는 숫자를 찾는 프로그램을 작성하세요.
//		만약 최빈값이 여러 개라면 그중 아무거나 하나만 출력하면 됩니다.
//		핵심 사고: 각 숫자가 몇 번 나왔는지 효율적으로 세는 방법. 
//		(힌트: 또 다른 배열을 카운팅 용도로 사용)
//		힌트: `배열`, `이중 for문`, `카운팅을 위한 변수 또는 배열`
		int [] num = {1,3,5,7,9,2,4,6,8,3,5,2,0,3,3,6,4,0,4,2,2,3
				,6,5,3,4,7,8,5,3,5,6,3,8,3,4,3,3,5,4,3,2}; //정해진 숫자
		int [] cnt = new int [10]; //1~9가능
		int maxCnt = 0;
		int maxNum = 0;
		
		// for문 1개 이용
		for(int i=0; i<num.length;i++) {
			cnt[num[i]]++;
			if(cnt[num[i]]>maxCnt) {
				maxCnt = cnt[num[i]];
				maxNum = num[i];
			}
		}
		System.out.println("최빈값 "+maxNum+"은(는) "+maxCnt+"번 나왔습니다.");
	}
}