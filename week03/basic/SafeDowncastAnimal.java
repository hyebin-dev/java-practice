package week03.basic;

public class SafeDowncastAnimal {

	public static void main(String[] args) {
		System.out.println("<업캐스팅/다운캐스팅 안전 체크>");
//		B-5) 업캐스팅/다운캐스팅 안전 체크
//		문제: `Animal`을 상위로, `Dog`(메서드 `wag()`), `Cat`을 하위로 만든다.
//		`Animal`을 인자로 받아 Dog인 경우에만 `wag()`를 호출하고 true를, 아니면 false를 반환하는 함수를 작성하라.
//		문제설명: 부모 타입으로 받은 참조는 실제로 자식일 수 있다(업캐스팅).
//		자식 전용 기능을 쓰려면 다운캐스팅이 필요한데, 안전을 위해 런타임 타입 검사가 필요하다.
//		힌트: 업캐스팅(자동), `instanceof`, 다운캐스팅, 다형성.
			Animal a1 = new Dog(); // 업캐스팅(자동): 실제 객체는 Dog, 참조 타입은 Animal
			System.out.println("Dog: " + checkDog(a1));
			
			Animal a2 = new Cat();
			System.out.println("Cat: " + checkDog(a2));
		
	}
	// 다운캐스팅 : 더 구체적인 신분증을 보여주는 것(ex. 직원증 -> 개발자)
	// 새 변수의 선언타입(원시타입 or 참조타입) 새 변수 이름 = (캐스트 연산자) 캐스트 대상
	// 어디 있는지 알려주는 주소표 (ex. d.name() -> d(화사표)를 따라가서 Dog의 name 필드 값을 읽어옴.)
	// 캐스트 연산자 -> 지금 이 타입으로 보겠다. (ex. (int)3.14 -> 정수 타입으로 보겠다.)
	static boolean checkDog(Animal animal){
		if (animal == null) return false; // 가드절 -> 즉시 종료(빠르게 걸러내기)
		if (animal instanceof Dog) {
		    Dog d = (Dog) animal; // ← 다운캐스팅: ‘Dog 관점’으로 보겠다
		    return d.wag();
		}
		return false;
	}
}

class Animal {

}

class Dog extends Animal {
	public boolean wag() {
		return true;
	}
}

class Cat extends Animal {	
	
}