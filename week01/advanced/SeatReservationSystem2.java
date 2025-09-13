package week01.advanced;

import java.util.Scanner;

public class SeatReservationSystem2 {

	public static void main(String[] args) {
		System.out.println("<좌석 예매 시스템2>");
		String [][] movie1 = new String [9][8];
		String [][] movie2 = new String [6][6];
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int r=0;
		int c=0;
		String movie = "";
		
		for(int i=0;i<movie1.length;i++) {
			for(int j=0; j<movie1[i].length;j++) {
				movie1[i][j]= "("+(i+1)+","+(j+1)+")";
			}
			}

		for(int i=0;i<movie2.length;i++) {
			for(int j=0; j<movie2[i].length;j++) {
				movie2[i][j]= "("+(i+1)+","+(j+1)+")";
			}
			}
		
		System.out.println("예매를 진행 하시겠습니까?> ");
		System.out.println("(그만하시고 싶으시면 종료라고 입력해주세요.)");
		input = scanner.nextLine();
		
		while(!input.equals("종료")) {
			//영화 선택
			System.out.println(" 영화A || 영화B ");
			System.out.println("어떤 영화를 예매 하시겠습니까?");
			movie = scanner.nextLine();
			while(!movie.equals("영화A")&&!movie.equals("영화B")) {
				System.out.println("지금 상영중인 영화가 아닙니다.");
				System.out.println(" 영화A || 영화B ");
				System.out.println("예매를 원하시는 영화를 선택해주세요.> ");
				movie = scanner.nextLine();
			}
			//영화A 예매 진행
			if(movie.equals("영화A")) {
				System.out.println("<영화 A 좌석 현황>");
				for(int i=0;i<movie1.length;i++) {
					for(int j=0; j<movie1[i].length;j++) {
						System.out.print(movie1[i][j]+" ");
					}
					System.out.println();
					}
				System.out.println("원하는 좌석을 선택해주세요.> ");
				String seat = scanner.nextLine();
				String []rc = seat.split(",");
				r = Integer.parseInt(rc[0]);
				c = Integer.parseInt(rc[1]);
				while(movie1[r-1][c-1].equals("  X  ")) {
					System.out.println("이미 예매된 좌석입니다.");
					System.out.println("좌석을 다시 선택해주세요.> ");
					seat = scanner.nextLine();
					rc = seat.split(",");
					r = Integer.parseInt(rc[0]);
					c = Integer.parseInt(rc[1]);
				}
				movie1[r-1][c-1] = "  X  ";
				for(int i=0;i<movie1.length;i++) {
					for(int j=0; j<movie1[i].length;j++) {
						System.out.print(movie1[i][j]+" ");
					}
					System.out.println();
					}
				System.out.println(r+"행"+c+"열 자리 예매가 완료되었습니다.");
				System.out.println("예매를 계속 원하시나요?> ");
				System.out.println("(그만하시고 싶으시면 종료라고 입력해주세요.)");
				input = scanner.nextLine();
			}
			//영화B 예매 진행
			else if(movie.equals("영화B")) {
				System.out.println("<영화 B 좌석 현황>");
				for(int i=0;i<movie2.length;i++) {
					for(int j=0; j<movie2[i].length;j++) {
						System.out.print(movie2[i][j]+" ");
					}
					System.out.println();
					}
				System.out.println("원하는 좌석을 선택해주세요.> ");
				String seat = scanner.nextLine();
				String []rc = seat.split(",");
				r = Integer.parseInt(rc[0]);
				c = Integer.parseInt(rc[1]);
				while(movie2[r-1][c-1].equals("  X  ")) {
					System.out.println("이미 예매된 좌석입니다.");
					System.out.println("좌석을 다시 선택해주세요.> ");
					seat = scanner.nextLine();
					rc = seat.split(",");
					r = Integer.parseInt(rc[0]);
					c = Integer.parseInt(rc[1]);
				}
				movie2[r-1][c-1] = "  X  ";
				for(int i=0;i<movie2.length;i++) {
					for(int j=0; j<movie2[i].length;j++) {
						System.out.print(movie2[i][j]+" ");
					}
					System.out.println();
					}
				System.out.println(r+"행"+c+"열 자리 예매가 완료되었습니다.");
				System.out.println("예매를 계속 원하시나요?> ");
				System.out.println("(그만하시고 싶으시면 종료라고 입력해주세요.)");
				input = scanner.nextLine();
			}		
			}
		scanner.close();
	}
}
