package week02.intermediate;

public class Car {
    String modelName;
    String color;

    // 필드(this.~) = 매개변수 
    // -> 생성자 생성시 필드에 배개변수 값을 넣어 초기화 하기 위해 사용
    public Car(String modelName, String color) {
        this.modelName = modelName;
        this.color = color;
    }

    public String getModelName() { // 자동차의 모델명을 출력하기 위해 따로 꺼내기
        return modelName;
    }

//	14단계(응용): Car 객체 배열 생성 및 초기화
//	문제: 모델명(modelName)과 색상(color)을 갖는 Car 클래스를 Car.java에 만드세요.
//	CarTest.java에서 3대의 Car 객체를 저장할 수 있는 배열을 선언하고,각 배열 요소에 
//	"쏘나타", "K5", "G80"	모델을 가진 Car 객체를 생성하여 할당하세요. 
//	for문을 이용해 모든 자동차의 모델명을 출력하세요.
//	핵심 사고: 기본 타입이 아닌 사용자 정의 클래스(객체)를 배열로 관리하는 방법을 익힙니다.
//	힌트: 객체 배열, for문, 클래스, 생성자

}

