package week02.intermediate;

public class Hero {
    private String name;
    private int hp;
    private int power;
	
	Hero(String name, int hp, int power){
		this.name = name;
		this.hp = hp;
		this.power = power;
		
	}
	
	public int attack(Monster target) {
        int remain = target.getHp() - this.power;
        target.setHp(remain);
        return remain;	
	}

	public String getName() {
		return name;
	}
	
	public int getHp() {
		return hp;
	}

	public int getPower() {
		return power;
	}

//	17단계(응용): Monster와 Hero의 전투
//	문제: 이름(name)과 체력(hp), 공격력(power)을 갖는 Hero 클래스와 Monster 클래스를 각각 만드세요.
//	Hero 클래스에, Monster 객체를 매개변수로 받아 공격하는 attack(Monster target) 메서드를 구현하세요.
//	이 메서드가 호출되면, 공격받은 target의 hp는 Hero의 power만큼 감소해야 합니다. Battle.java에서
//	영웅과 몬스터 객체를 만들고, 영웅이 몬스터를 공격한 후 몬스터의 남은 체력을 출력하여 확인하세요.
//	핵심 사고: 메서드의 매개변수로 클래스 객체를 전달하여 객체 간의 상호작용을 구현하는 방법을 학습합니다.
//	힌트: 클래스, 객체를 매개변수로 전달, 멤버 변수 변경, setter

}
