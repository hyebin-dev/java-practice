package week02.advanced;

public class Bank {

	public static void main(String[] args) {
		System.out.println("<은행 계좌 이체 트랜잭션>");
//		27단계 (심화): 은행 계좌 이체 트랜잭션
//		문제: Account.java (계좌주 owner, 잔액 balance)에, 다른 Account 객체와 이체할 금액을
//		매개변수로 받아 계좌 이체를 수행하는 transfer(Account target, int amount)메서드를
//		구현하세요. 이체에 성공하면 true, 잔액 부족으로 실패하면 false를 리턴하도록 만드세요.
//		Bank.java에서 두 계좌를 만들고,이체 메서드를 호출한 뒤 리턴값에 따라 "이체 성공" 또는 "이체 실패"
//		를 출력하세요.
//		핵심 사고: 두 객체가 상호작용하며 서로의 상태를 변경하고, 작업의 성공/실패 여부를 리턴값으로 알려주는
//		트랜잭션 개념을 구현합니다.
//		힌트: 객체 간 상호작용, 메서드 리턴값(boolean), if문, private, getter, setter
		Account a = new Account("김학생", 123); // 만원 단위
		Account b = new Account("엄마", 500);
		Account c = new Account("아빠", 8000);
		
		boolean sucess = b.transfer(a, 10);
		System.out.print(b.getOwner() + "님이 " + a.getOwner() + "님 계좌로 10만원 ");
		System.out.println(sucess ? "이체 성공 하였습니다." : "이체 실패 하였습니다.");
		System.out.print(b.getOwner() + "님의 잔액은 " + b.getBalance() + "만원 남았습니다. ");
		System.out.println(a.getOwner() + "님의 잔액은 " + a.getBalance() + "만원 남았습니다.");
		System.out.println();
		
		sucess = a.transfer(c,134);
		System.out.print(a.getOwner() + "님이 " + c.getOwner() + "님 계좌로 10만원 ");
		System.out.println(sucess ? "이체 성공 하였습니다." : "이체 실패 하였습니다.");
		System.out.print(a.getOwner() + "님의 잔액은 " + a.getBalance() + "만원 남았습니다. ");
		System.out.println(c.getOwner() + "님의 잔액은 " + c.getBalance() + "만원 남았습니다.");
	}

}
