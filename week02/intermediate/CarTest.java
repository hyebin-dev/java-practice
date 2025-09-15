package week02.intermediate;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("<Car 객체 배열 생성 및 초기화>");
//		14단계(응용): Car 객체 배열 생성 및 초기화
//		문제: 모델명(modelName)과 색상(color)을 갖는 Car 클래스를 Car.java에 만드세요.
//		CarTest.java에서 3대의 Car 객체를 저장할 수 있는 배열을 선언하고,각 배열 요소에 
//		"쏘나타", "K5", "G80"	모델을 가진 Car 객체를 생성하여 할당하세요. 
//		for문을 이용해 모든 자동차의 모델명을 출력하세요.
//		핵심 사고: 기본 타입이 아닌 사용자 정의 클래스(객체)를 배열로 관리하는 방법을 익힙니다.
//		힌트: 객체 배열, for문, 클래스, 생성자
		Car[] car = new Car[3];
        car[0] = new Car("쏘나타", "블랙");
        car[1] = new Car("K5", "화이트");
        car[2] = new Car("G80", "그레이");
		
        System.out.println("----for문----");
		for(int i=0; i<car.length; i++) {
			System.out.println(car[i].getModelName());
		}
		
		System.out.println("--향상된 for문--");
		for (Car c : car) { // 향상된 for문
			System.out.println(c.getModelName());
			}
		
	}

}

