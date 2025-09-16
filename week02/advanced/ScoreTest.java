package week02.advanced;

public class ScoreTest {

	public static void main(String[] args) {
		System.out.println("<클래스로 재설계하는 성적 통계 프로그램 1>");
//		21단계 (심화): 클래스로 재설계하는 성적 통계 프로그램
//		문제: 이름, 국어, 영어, 수학 점수를 private 멤버로 갖는 Score.java를 만드세요. 총점을 리턴하는
//		getTotal()과 평균을 리턴하는 getAverage() 메서드를 구현하세요. ScoreTest.java에서
//		Score 객체 배열을 만들고 3명의 학생 정보를 저장한 후, 반 전체의 국어 평균, 영어 평균, 수학 평균을
//		계산하여 출력하세요.
//		핵심 사고: 여러 객체의 데이터를 종합하여 통계를 내는 로직을 구현하며, 데이터와 기능을 클래스로
//		캡슐화하는 설계를 연습합니다.
//		힌트: 클래스, private, getter, 메서드, 객체 배열, 이중 for문, 자료형 변환
		Score[] student = new Score[3];
		student [0] = new Score("김학생", 34, 98, 89);
		student [1] = new Score("이학생", 56, 76, 60);
		student [2] = new Score("박학생", 88, 95, 100);
    	
        int[] sums = new int[3];

        for (int i = 0; i < student.length; i++) {
            Score s = student[i];
            // 과목별
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:  sums[0]  += s.getKorean();  break; // kor
                    case 1:  sums[1]  += s.getEnglish(); break; // eng
                    case 2: sums[2] += s.getMath();    break; // math
                }
            }
            System.out.println(s.getName() + "의 총점: " + s.getTotal() + ", 평균: " + s.getAverage());
        }
		
//		int korTotal = 0, engTotal = 0, mathTotal = 0;
//		System.out.println("----------------학생별 평균----------------");
//		for( Score s : student ) { // 단일 for문도 사용 가능
//			System.out.println(s.getName() + "의 총점: " + s.getTotal() + ", 평균: " + s.getAverage());
//				korTotal += s.getKorean();
//				engTotal += s.getEnglish();
//				mathTotal += s.getMath();
//		}
//		System.out.println("------------반 평균------------");
//		System.out.println("국어 평균: " + (double) korTotal / student.length );
//		System.out.println("영어 평균: " + (double) engTotal / student.length);
//		System.out.println("수학 평균: " + (double) mathTotal / student.length);
		
	}

}
