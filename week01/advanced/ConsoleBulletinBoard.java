package week01.advanced;

import java.util.Scanner;

public class ConsoleBulletinBoard {

	public static void main(String[] args) {
		System.out.println("<콘솔 기반 게시판 만들기 (기능 구현)>");
//		27단계 (심화): 콘솔 기반 게시판 만들기 (기능 구현)
//		문제: 문자열 배열을 사용하여 간단한 콘솔 게시판의 핵심 기능을 구현합니다.
//		제목들을 저장할 `String[]` 배열을 만들고, 
//		다음 기능을 메뉴로 제공하는 프로그램을 작성하세요.
//		    1. 글쓰기: 사용자에게 제목을 입력받아 배열에 추가합니다.
//		    2. 목록 보기: 배열에 저장된 모든 제목을 번호와 함께 출력합니다.
//		    3. 종료: 프로그램을 끝냅니다.
//		- 핵심 사고: 배열의 인덱스를 관리하여 데이터를 추가하고 조회하는 로직
//		- 힌트: `String 배열`, `while문`, `switch문`,
//		`글 개수를 저장할 count 변수`
		int cnt=0;
		String [] title = new String[5];
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		System.out.println("------------menu------------");
		System.out.println(" 1.글쓰기 || 2.목록 보기 || 3.종료 ");
		System.out.println("원하는 메뉴의 숫자를 입력해주세요.> ");
		
		int menu = scanner.nextInt();
		scanner.nextLine();//개행 소비
		
		switch(menu) {
		case 1:
			if(cnt==title.length) {
			    String[] newTitle = new String[title.length + 5];
			    System.arraycopy(title, 0, newTitle, 0, title.length);
			    title = newTitle;
		}
		System.out.println("제목: ");
		title[cnt] = scanner.nextLine();
		cnt++; 
		break;
		case 2: for(int i=0; i<cnt;i++) {
			System.out.println((i+1)+". 제목: "+title[i]);
		}break;
		case 3: System.out.println("시스템을 종료합니다.");
		scanner.close();
		return;
		default: System.out.println("메뉴에 없는 번호를 입력하셨습니다."); break;
		}
		}
	}
}