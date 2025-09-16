package week02.advanced;

public class ScoreTest2 {

    public static void main(String[] args) {
        System.out.println("<클래스로 재설계하는 성적 통계 프로그램 2>");
//    	21단계 (심화): 클래스로 재설계하는 성적 통계 프로그램
//    	문제: 이름, 국어, 영어, 수학 점수를 private 멤버로 갖는 Score.java를 만드세요. 총점을 리턴하는
//    	getTotal()과 평균을 리턴하는 getAverage() 메서드를 구현하세요. ScoreTest.java에서
//    	Score 객체 배열을 만들고 3명의 학생 정보를 저장한 후, 반 전체의 국어 평균, 영어 평균, 수학 평균을
//    	계산하여 출력하세요.
//    	핵심 사고: 여러 객체의 데이터를 종합하여 통계를 내는 로직을 구현하며, 데이터와 기능을 클래스로
//    	캡슐화하는 설계를 연습합니다.
//    	힌트: 클래스, private, getter, 메서드, 객체 배열, 이중 for문, 자료형 변환

        Score2[] student = new Score2[3];
        student[0] = new Score2("김학생", 34, 98, 89);
        student[1] = new Score2("이학생", 56, 76, 60);
        student[2] = new Score2("박학생", 88, 95, 100);

        int[] sums = new int[Score2.SUBJECTS];

        for (int i = 0; i < student.length; i++) {
            Score2 s = student[i];
            // 과목 인덱스 순회
            for (int j = 0; j < Score2.SUBJECTS; j++) {
                sums[j] += s.getScore(j);
            }
            System.out.println(s.getName() + "의 총점: " + s.getTotal() + ", 평균: " + s.getAverage());
        }
    }
}
