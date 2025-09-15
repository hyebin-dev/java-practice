package week02.intermediate;

public class Cafe {
	String cafeName;
	Barista barista;
	
    Cafe(String cafeName, Barista barista) {
        this.cafeName = cafeName;
        this.barista = barista;
    }
	
    public String print() {
        return "카페 [" + cafeName + "]의 바리스타는 [" + barista.getName() + "]입니다.";
    }
	
//	20단계(응용): Cafe와 Barista 관계 모델링
//	문제: Barista.java에 이름(name) 멤버 변수를 만드세요. Cafe.java에 카페 이름(cafeName)과
//	Barista 객체(barista)를 멤버 변수로 만드세요. Cafe 객체를 생성할 때 카페 이름과 Barista 객체를
//	함께 받아 초기화하는 생성자를 구현하고, "카페 [cafeName]의 바리스타는 [barista's name]입니다."를
//	출력하는 메서드를 만드세요.
//	핵심 사고: 클래스가 다른 클래스의 객체를 멤버 변수로 포함하는 관계(Composition)를 이해하고 활용합니다.
//	힌트: 클래스 간의 관계, 객체를 멤버 변수로 사용, 생성자, getter
}
