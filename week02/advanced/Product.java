package week02.advanced;

public class Product {
	
	private String name;
	private int price;
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;	
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "상품명: " + name + ", 가격: " + price;
	}
	
//	24단계 (심화): 쇼핑몰 상품과 장바구니 시스템
//	문제:
//	    1. Product.java: 상품명(name), 가격(price)을 private 멤버와 Getter로 가집니다.
//	    2. Cart.java: Product 객체 배열(items, 크기 10)과 현재 담긴 개수(count)를
//	    멤버 변수로 가집니다.
//	    addProduct(Product p) 메서드와, 카트의 모든 상품 정보와 총액을 출력하는 displayCart()
//	    메서드를 구현합니다.
//	    3. Shopping.java의 main에서 여러 Product 객체를 만들고, while문을 통해 사용자에게
//	    상품 번호를 입력받아 Cart 객체에 추가합니다. '0'을 입력하면 displayCart()를
//	    호출하고 종료합니다.
//	핵심 사고: 서로 다른 역할을 하는 여러 클래스들이 상호작용하며 하나의 완성된 시스템을
//	구축하는 과정을 경험합니다.
//	힌트: 여러 클래스 설계, 객체 배열 관리, 객체 간 상호작용, while문, switch문, input

}
