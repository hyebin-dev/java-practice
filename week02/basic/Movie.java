package week02.basic;

public class Movie {
	String title;
	String director;

	public static void main(String[] args) {
		System.out.println("<Movie 클래스 정의하기>");
//		1단계(기초): Movie 클래스 정의하기
//		문제: 영화 제목(title)과 감독(director)을 String 타입 멤버 변수로 가지는 Movie 클래스를 정의하세요.
//		핵심 사고: 클래스와 멤버 변수의 가장 기본적인 선언 방법을 익힙니다.
//		힌트: 클래스 선언, 멤버 변수
        Movie m = new Movie();
        m.title = "드래곤 길들이기";
        m.director = "딘 데블로이스";
        System.out.println("영화: " + m.title + ", 감독: " + m.director);

	}

}
