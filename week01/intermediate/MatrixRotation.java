package week01.intermediate;

public class MatrixRotation {

	public static void main(String[] args) {
		System.out.println("<2차원 배열 회전시키기>");
//		19단계(응용): 2차원 배열 회전시키기
//		문제: 3x3 크기의 2차원 정수 배열을 선언하고 값을 초기화합니다.
//		이 배열을 시계 방향으로 90도 회전시킨 결과를 새로운 2차원 배열에
//		저장하고 출력하는 프로그램을 작성하세요.
//		힌트: 다중 배열, 다중 for문
		/* 0: {1,2,3}
		 * 1: {4,5,6}
		 * 2: {7,8,9}
		 * {7,4,1} -> [2][0]->[0][0]  [1][0]->[0][1]  [0][0]->[0][2]
		 * {8,5,2} -> [2][1],[1][1],[0][1]
		 * {9,6,3} -> [2][2],[1][2],[0][2]
		 * i=행->j=열(순서는반대로) / [2][0]->[0][0] 2->0 행과 열이 바뀜 (순서는 반대로)
		 * 3*3배열 -> 3-i
		 */
		int[][] arr = {{10,27,63}, {43,28,17}, {57,93,69}};
		/* 10 27 63
		 * 43 28 17
		 * 57 93 69
		 */
		int [][] arr2 = new int[3][3];
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr2[j][3-1-i] = arr[i][j];
			}
		}
		for(int i=0; i<arr2.length;i++) {
			for(int j=0; j<arr2[i].length; j++) {
		System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}