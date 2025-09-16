package week02.advanced;

public class Score2 {
	
    private String name;
    private int korean;
    private int english;
    private int math;
    
    public static final int SUBJECTS = 3; // 고정상수

    Score2(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    int getTotal() {
        return korean + english + math;
    }

    double getAverage() {
        return (double) getTotal() / SUBJECTS;
    }

    // 인덱스로 점수 받기: 0=국,1=영,2=수
    public int getScore(int idx) {
        switch (idx) {
            case 0: return korean;
            case 1: return english;
            case 2: return math;
            default: throw new IllegalArgumentException("subject idx: " + idx);
        }
    }

	public String getName() {
		return name;
	}

	public int getKorean() {
		return korean;
	}

	public int getEnglish() {
		return english;
	}

	public int getMath() {
		return math;
	}
	
//	21단계 (심화): 클래스로 재설계하는 성적 통계 프로그램
//	문제: 이름, 국어, 영어, 수학 점수를 private 멤버로 갖는 Score.java를 만드세요. 총점을 리턴하는
//	getTotal()과 평균을 리턴하는 getAverage() 메서드를 구현하세요. ScoreTest.java에서
//	Score 객체 배열을 만들고 3명의 학생 정보를 저장한 후, 반 전체의 국어 평균, 영어 평균, 수학 평균을
//	계산하여 출력하세요.
//	핵심 사고: 여러 객체의 데이터를 종합하여 통계를 내는 로직을 구현하며, 데이터와 기능을 클래스로
//	캡슐화하는 설계를 연습합니다.
//	힌트: 클래스, private, getter, 메서드, 객체 배열, 이중 for문, 자료형 변환
    
}