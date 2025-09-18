package week02.advanced;

import java.util.Scanner;

public class VendingMachineTest {

	public static void main(String[] args) {
//		30단계 (심화): 자판기 시스템의 완성
//		문제:
//		    1. Drink.java: 이름(name), 가격(price), 재고(stock)를 private 멤버와
//		    Getter/Setter로 가집니다.
//		    2. VendingMachine.java: Drink 객체 배열(drinks)과 투입된 금액(money)을
//		    멤버로 가집니다. 음료를 세팅하는 setupDrinks() 메서드, 돈을 투입하는 insertMoney(int m),
//		    음료를 선택하는 selectDrink(int index) 메서드를 구현하세요. selectDrink는 성공 시
//		    거스름돈, 재고 부족 시 -1, 금액 부족 시 -2를 리턴합니다.
//		    3. VendingMachineTest.java에서 자판기를 만들고, while 루프를 통해 사용자 상호작용
//		    (돈 투입, 음료 선택)을 시뮬레이션하세요. selectDrink의 리턴값에 따라 다른 메시지를
//		    출력해야 합니다.
//		핵심 사고: 여러 클래스와 복잡한 상태(재고, 돈)를 종합적으로 관리하며, 메서드의 다양한 리턴값을 통해
//		프로그램의 흐름을 제어하는 완성도 높은 프로그램을 설계합니다.
//		힌트: 종합적인 클래스 설계, 상태 관리, 메서드 리턴값을 이용한 로직 분기, while문,
//		if-else if-else, input
		VendingMachine v = new VendingMachine();
		v.setupDrinks();
		Scanner sc = new Scanner(System.in);
		
		boolean machine = true;
		while(machine) {
			System.out.println("1.돈 투입 | 2.음료 선택 | 3. 종료");
			int num = sc.nextInt();
			
			if (num == 1) {
				System.out.println("돈을 넣어주세요.> ");
				int money = sc.nextInt();
				v.insertMoney(money);
			}
			if (num == 2) {
				v.print();
				System.out.println("원하는 음료를 선택해주세요.> ");
				int index = sc.nextInt()-1;
				int re = v.selectDrink(index);
				if (re == -1) {
					System.out.println("현재 재고가 없습니다.");
				}
				else if (re == -2) {
					
				}
				else if (re == -3) {
					System.out.println("없는 번호입니다.");
				}
				else {
					System.out.println("구매가 완료 되었습니다.");
					System.out.println("거스름돈 " + re + "원 입니다.");
				}
			}
			if (num == 3) {
				machine = false;
			}
			
			if (num < 0 || num > 3) {
				System.out.println("메뉴에 없는 번호입니다. 다시 선택해주세요.");
				System.out.println("1.돈 투입 | 2.음료 선택 | 3. 종료");
				num = sc.nextInt();
			}
			
		}
		sc.close();
	}

}
