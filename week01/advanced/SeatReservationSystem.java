package week01.advanced;

import java.util.Scanner;

public class SeatReservationSystem {

	public static void main(String[] args) {
		System.out.println("<좌석 예매 시스템>");
//		30단계 (심화): 좌석 예매 시스템
//		문제: 소극장 좌석(예: 5x10)을 2차원 배열로 만듭니다.
//		사용자가 원하는 좌석 위치(행, 열)를 입력하면 해당 좌석을 
//		예매 처리하는 시스템을 만드세요.
//		    - 빈 좌석은 'O', 예매된 좌석은 'X'로 표시합니다.
//		    - 사용자가 예매를 시도하면 현재 좌석 현황을 먼저 보여줍니다.
//		    - 이미 예매된 좌석을 선택하면 "이미 예매된 좌석입니다."라고 알려주고 
//		      다시 선택하게 합니다.
//		    - 예매가 완료되면 좌석을 'X'로 바꾸고 "예매가 완료되었습니다."라고 출력합니다.
//		    - 사용자가 '종료'를 입력할 때까지 시스템이 계속 실행되어야 합니다.
//		핵심 사고: 프로그램이 실행되는 동안 배열의 상태가 계속 유지되고 변경되어야 함
//		힌트: `다중 배열`, `while(true)` 루프, `break`, `if문`, 
//		     `좌석 현황을 출력하는 이중 for문`
		char [][] theater = new char [5][10];
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int r=0;
		int c=0;
		
		for(int i=0;i<theater.length;i++) {
			for(int j=0; j<theater[i].length;j++) {
				theater[i][j]='O';
			}
			}
		
		System.out.println("예매를 진행 하시겠습니까?(네/종료)> ");
		input = scanner.nextLine();
		
		while(!input.equals("종료")) {
			for(int i=0;i<theater.length;i++) {
				for(int j=0; j<theater[i].length;j++) {
					System.out.print(theater[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("원하는 좌석을 선택해주세요.(ex:3,9)> ");
			String seat = scanner.nextLine();
			String []rc = seat.split(",");
			r = Integer.parseInt(rc[0]);
			c = Integer.parseInt(rc[1]);
			while(theater[r-1][c-1] == 'X') {
				System.out.println("이미 예매된 좌석입니다.");
				System.out.println("좌석을 다시 선택해주세요.(ex:3,10)> ");
				seat = scanner.nextLine();
				rc = seat.split(",");
				r = Integer.parseInt(rc[0]);
				c = Integer.parseInt(rc[1]);
			}
			theater[r-1][c-1] = 'X';
			for(int i=0;i<theater.length;i++) {
				for(int j=0; j<theater[i].length;j++) {
					System.out.print(theater[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println(r+"행"+c+"열 자리 예매가 완료되었습니다.");
			
			System.out.println("예매를 계속 원하시나요?(네/종료)> ");
			input = scanner.nextLine();
		}
		scanner.close();
	}
}
