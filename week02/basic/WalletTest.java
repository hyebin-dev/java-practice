package week02.basic;

public class WalletTest {

	public static void main(String[] args) {
		System.out.println("<private,getter,setter>");
//		8단계(기초): 정보 은닉을 위한 private
//		문제: Wallet.java 클래스에 private 접근 제어자를 사용하여 money (돈) int 타입 멤버 변수를 선언하세요. WalletTest.java에서 객체를 생성하고 money에 직접 접근 (myWallet.money = 10000;) 하려 할 때 컴파일 에러가 발생하는 것을 확인하세요.
//		핵심 사고: private을 통해 외부의 직접적인 접근을 막는 정보 은닉(캡슐화)의 필요성을 체감합니다.
//		힌트: 클래스, 접근제어자(private), 멤버 변수
//
//		9단계(기초): private 변수를 위한 Getter
//		문제: 위 8번 문제의 Wallet.java 클래스에, private으로 선언된 money 값을 읽어서 리턴해주는 public 메서드 getMoney()를 추가하세요. WalletTest.java에서 이 메서드를 통해 money 값을 읽어와 출력하세요.
//		핵심 사고: private 멤버의 값을 안전하게 외부로 제공하는 Getter의 역할과 구현 방법을 학습합니다.
//		힌트: 클래스, 접근제어자(private, public), getter, 리턴타입, return
//
//		10단계(기초): private 변수를 위한 Setter
//		문제: 위 9번 문제의 Wallet.java 클래스에, 외부로부터 int 값을 받아 money를 변경하는
//		public void 메서드 setMoney(int newMoney)를 추가하세요. WalletTest.java에서
//		이 메서드를 통해 money 값을 5000으로 설정하고, getMoney()로 다시 확인하세요.
//		핵심 사고: private 멤버의 값을 안전하게 변경하는 Setter의 역할과 구현 방법을 학습합니다.
//		힌트: 클래스, 접근제어자(private, public), setter, void, 매개변수, this
		Wallet w = new Wallet();
//		w.money = 10000; 8단계
		
		int m1 = w.getMoney();
		System.out.println(m1); // 기본값 = 0
		
		w.setMoney(5000); // 값을 5000으로 변경
		
		int m2 = w.getMoney(); // 값을 읽어옴
		System.out.println(m2);

	}

}
