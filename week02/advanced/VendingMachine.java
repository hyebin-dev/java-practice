package week02.advanced;

public class VendingMachine {
	private Drink [] drinks;
	private int money;
	
	void setupDrinks(){
		drinks = new Drink[5];
		drinks[0] = new Drink("콜라", 1500, 8);
		drinks[1] = new Drink("사이다", 1500, 7);
		drinks[2] = new Drink("환타", 1500, 6);
		drinks[3] = new Drink("알로에", 3000, 5);
		drinks[4] = new Drink("커피", 800, 2);	
	}
	
	void print() {
		for (int i = 0; i < drinks.length; i++) {
			Drink d = drinks[i];
			System.out.println((i+1) + ". " + d.getName() + " 가격: " + d.getPrice() + ", 재고: " + d.getStock());
		}
	}
	
	void insertMoney(int m){
		money += m;
		System.out.println("현재 투입 금액: " + money);
	}
	
	int selectDrink(int index){
		if (index < 0 || index > drinks.length) {
			return -3;
		}
		Drink d = drinks[index];
		
		if (d.getStock() <= 0) {
		return -1;
		}
		if (money < d.getPrice()) {
			System.out.println("현재 투입 금액이" + (d.getPrice() - money) + "원만큼 부족합니다.");
			return -2;
		}
		d.setStock(d.getStock()-1);
		int change = money - d.getPrice();
		money = 0;
		return change;
	}

}
	
//	30단계 (심화): 자판기 시스템의 완성
//	문제:
//	    1. Drink.java: 이름(name), 가격(price), 재고(stock)를 private 멤버와
//	    Getter/Setter로 가집니다.
//	    2. VendingMachine.java: Drink 객체 배열(drinks)과 투입된 금액(money)을
//	    멤버로 가집니다. 음료를 세팅하는 setupDrinks() 메서드, 돈을 투입하는 insertMoney(int m),
//	    음료를 선택하는 selectDrink(int index) 메서드를 구현하세요. selectDrink는 성공 시
//	    거스름돈, 재고 부족 시 -1, 금액 부족 시 -2를 리턴합니다.
//	    3. VendingMachineTest.java에서 자판기를 만들고, while 루프를 통해 사용자 상호작용
//	    (돈 투입, 음료 선택)을 시뮬레이션하세요. selectDrink의 리턴값에 따라 다른 메시지를
//	    출력해야 합니다.
//	핵심 사고: 여러 클래스와 복잡한 상태(재고, 돈)를 종합적으로 관리하며, 메서드의 다양한 리턴값을 통해
//	프로그램의 흐름을 제어하는 완성도 높은 프로그램을 설계합니다.
//	힌트: 종합적인 클래스 설계, 상태 관리, 메서드 리턴값을 이용한 로직 분기, while문,
//	if-else if-else, input
