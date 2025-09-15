package week02.intermediate;

public class Member {
	String id;
	String name;
	
	Member(String id, String name){
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

//	16단계(응용): Member 배열에서 회원 검색
//	문제: 아이디(id)와 이름(name)을 갖는 Member 클래스를 Member.java에 만드세요.
//	MemberManage.java에서 5명의 회원 정보를 Member 배열에 미리 저장하세요.
//	사용자로부터 검색할 아이디를 입력받아, 아이디가 일치하는 회원을 찾으면 그 회원의 이름을 출력하고,
//	찾지 못하면 "존재하지 않는 아이디입니다."를 출력하세요.
//	핵심 사고: 배열에 저장된 객체들을 순회하며 특정 조건을 만족하는 객체를 찾아내는 탐색 로직을 구현합니다.
//	힌트: 객체 배열, 클래스, for문, if문, String.equals(), input, boolean 변수(flag)

}
