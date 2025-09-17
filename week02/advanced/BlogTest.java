package week02.advanced;

public class BlogTest {

	public static void main(String[] args) {
		System.out.println("<블로그와 포스트 관계 모델링>");
//		26단계 (심화): 블로그와 포스트 관계 모델링
//		문제:
//		    1. Post.java: 제목(title), 내용(content)을 멤버로 가집니다.
//		    2. Blog.java: 블로그 제목(blogTitle)과 Post 객체 배열(posts, 크기 100),
//		    현재 포스트수(postCount)를 멤버로 가집니다. 글을 쓰는 writePost(String title,
//		    String content)메서드와, 블로그의 모든 포스트 제목을 출력하는 listPosts()
//		    메서드를구현하세요.
//		핵심 사고: 일대다(One-to-Many) 관계 (하나의 블로그는 여러 포스트를 가짐)를 클래스와
//		객체 배열을 이용해 모델링하는 방법을 학습합니다.
//		힌트: 일대다 관계 모델링, 객체 배열, 클래스 간의 관계, 메서드
		Blog b = new Blog("개발 블로그");
		b.writePost("1일차", "오늘은 자바 공부를 해봤습니다.");
		b.writePost("2일차", "if문, for문 복습을 하고 있습니다.");
		b.writePost("3일차", "어제 풀어봤던 문제들을 복습해봤습니다.");
		b.listPosts();
	}

}
