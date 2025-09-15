package week02.intermediate;

public class Product {
	String name;
	int price;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}	
	
//	15단계(응용): 특정 조건의 객체만 골라내기
//	문제: Product.java에 상품명(name)과 가격(price) 멤버 변수를 만드세요.ProductTest.java에서
//	Product 객체 배열에 여러 상품 정보를 저장하세요. for문과 if문을 사용하여 가격이 10000원 이상인 상품의
//	이름만 출력하세요.
//	핵심 사고: 객체 배열을 순회하며 각 객체의 상태(멤버 변수)에 따라 조건부 로직을 처리하는 능력을 기릅니다.
//	힌트: 객체 배열, 클래스, for문, if문, getter, 비교 연산자

}
