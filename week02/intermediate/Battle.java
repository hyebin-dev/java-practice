package week02.intermediate;

public class Battle {

	public static void main(String[] args) {
		System.out.println("<Monster와 Hero의 전투>");
//		17단계(응용): Monster와 Hero의 전투
//		문제: 이름(name)과 체력(hp), 공격력(power)을 갖는 Hero 클래스와 Monster 클래스를 각각 만드세요.
//		Hero 클래스에, Monster 객체를 매개변수로 받아 공격하는 attack(Monster target) 메서드를 구현하세요.
//		이 메서드가 호출되면, 공격받은 target의 hp는 Hero의 power만큼 감소해야 합니다. Battle.java에서
//		영웅과 몬스터 객체를 만들고, 영웅이 몬스터를 공격한 후 몬스터의 남은 체력을 출력하여 확인하세요.
//		핵심 사고: 메서드의 매개변수로 클래스 객체를 전달하여 객체 간의 상호작용을 구현하는 방법을 학습합니다.
//		힌트: 클래스, 객체를 매개변수로 전달, 멤버 변수 변경, setter
		Monster m = new Monster("오크",100,10);
		Hero h = new Hero("기사",500,30);
		
		System.out.println("Hero Name: " + h.getName() + ", HP: " + h.getHp() + ", POWER: " + h.getPower());
		System.out.println("Monster Name: " + m.getName() + ", HP: " + m.getHp() + ", POWER: " + m.getPower());
		h.attack(m);
		System.out.println(m.getName() + "가 " + h.getName() + "의 공격을 받았습니다.");
		System.out.println(m.getName() + "의 체력이 " + h.getPower() + "만큼 감소했습니다.");
		System.out.println(m.getName() + "의 체력이 " + m.getHp() + "만큼 남았습니다.");		
	}
}
