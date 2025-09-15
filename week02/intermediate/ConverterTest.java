package week02.intermediate;

public class ConverterTest {

	public static void main(String[] args) {
		System.out.println("<static 메서드를 가진 온도 변환 클래스>");
//		13단계(응용): static 메서드를 가진 온도 변환 클래스
//		문제: TemperatureConverter.java 클래스를 만들고, 모든 메서드를 static으로 구현하세요.
//		    1. static double fahrenheitToCelsius(double f): 화씨를 섭씨로 변환
//		    2. static double celsiusToFahrenheit(double c): 섭씨를 화씨로 변환
//		    ConverterTest.java에서 객체 생성 없이 클래스 이름으로 직접 두 메서드를 호출하여 결과를 확인하세요.
//		핵심 사고: 객체의 상태와 무관한 기능들을 static 메서드로 묶어 유틸리티성 클래스를 만드는 방법을 학습합니다.
//		힌트: static 메서드, 클래스, double, 연산자, return
		
		// 객체 생성 없이 클래스 이름으로 직접 두 메서드를 호출
        double c = TemperatureConverter.fahrenheitToCelsius(100);
        double f = TemperatureConverter.celsiusToFahrenheit(32);

        System.out.println("화씨 : 68, 섭씨 : "+c);
        System.out.println("섭씨 : 32, 화씨 : "+f);

	}

}

