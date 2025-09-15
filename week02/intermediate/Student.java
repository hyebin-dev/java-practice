package week02.intermediate;

public class Student {
	private static int studentCount;
	
	Student(){
		studentCount++;
	}
	
	public static int getStudentCount() {
		return studentCount;
	}
	
//		12단계(응용): static 변수를 이용한 학생 수 카운트
//		문제: Student.java에 학생이 생성될 때마다 1씩 증가하는 private static int studentCount;변수와,
//		이 변수의 값을 리턴하는 public static int getStudentCount() 메서드를 만드세요.
//		Student의 생성자가 호출될 때 studentCount를 1씩 증가시키세요. StudentTest.java에서
//		학생 객체를 여러 명 생성한 후, Student.getStudentCount()를 호출하여 총 학생 수를 출력하세요.
//		핵심 사고: 모든 객체가 공유하는 데이터인 static 변수의 특성과 활용법을 이해합니다.
//		힌트: static 변수, static 메서드, 생성자, private, public, 클래스명.메서드()

}
