package week01.basic;

public class StudentGradeAverage {

	public static void main(String[] args) {
		System.out.println("<2차원 배열로 성적 평균 구하기>");
//		10단계(기초): 2차원 배열로 성적 평균 구하기
//		문제: 3명의 학생에 대한 3과목(국어, 영어, 수학)의 점수를 2차원 배열에 저장하고,
//		각 학생의 평균 점수를 계산하여 출력하는 프로그램을 작성하세요.
//		힌트: 다중 배열, for문
		int[] sum = new int[3];
		int[][] score = {
				{100, 29, 71},
				{87, 96, 45},
				{48 ,69, 70}
		};
		for(int i=0; i<sum.length; i++) {
			for(int j=0; j<score[i].length; j++) { //score[i].length -> 과목수
				sum[i] += score[i][j];
			}
		    double avg = (double)sum[i]/score[i].length;
		    System.out.println("학생"+(i+1)+"의 평균 점수:" + avg);
//			System.out.println((double)sum[i]/sum.length);
		} 
	}
}