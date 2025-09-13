package week01.advanced;

public class MatrixMultiplication {

	public static void main(String[] args) {
		System.out.println("<행렬(2차원 배열) 곱셈>");
//		24단계 (심화): 행렬(2차원 배열) 곱셈
//		문제: 3x2 행렬과 2x3 행렬을 각각 2차원 배열로 초기화합니다.
//		두 행렬의 곱셈 결과를 계산하여 3x3 크기의 새로운 2차원 배열에 저장하고 출력하세요.
//		핵심 사고: 행렬 곱셈의 수학적 원리를 3중 for문으로 구현하는 능력
//		행렬 곱셈식: C[i][j] = Σ₍k=0..M−1₎ A[i][k] · B[k][j]
//		힌트: `다중 배열`, 3중 for문
		/* A             B
		 * (0,0) (0,1)   
		 * -----------   (0,0) | (0,1) | (0,2) 
		 * (1,0) (1,1) X (1,0) | (1,1) | (1,2)
		 * -----------
		 * (2,0) (2,1)
		 * 
		 * A(0,0)*B(0,0)+A(0,1)*B(1,0)   A(0,0)*B(0,1)+A(0,1)*B(1,1)   A(0,0)*B(0,2)+A(0,1)*B(1,2)
		 * A(1,0)*B(0,0)+A(1,1)*B(1,0)   A(1,0)*B(0,1)+A(1,1)*B(1,1)   A(1,0)*B(0,2)+A(1,1)*B(1,2)
		 * A(2,0)*B(0,0)+A(2,1)*B(1,0)   A(2,0)*B(0,1)+A(2,1)*B(1,1)   A(2,0)*B(0,2)+A(2,1)*B(1,2)
		 * */
		int [][]arr1 = {{67,54},{10,81},{34,62}};
		int [][]arr2 = {{34,6,82},{64,91,23}};
		int [][]result = new int [3][3];
		
		// A[i][k]*B[k][j] = C[i][j]
		for(int i=0; i<arr1.length;i++) { //범위: A의 행 수
			for(int j=0;j<arr2[0].length;j++) { //범위: B의 열수 
				result[i][j]=0;
				//int sum = 0; //누적 2번째 방법
				for(int k=0;k<arr1[0].length;k++) { //범위:A의 열의 수 or B의 행의 수
					result[i][j] += arr1[i][k]*arr2[k][j];
					//sum += arr1[i][k]*arr2[k][j];
				}
				//result[i][j] = sum;
			}
		}
		for(int i=0;i<result.length;i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}