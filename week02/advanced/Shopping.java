package week02.advanced;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		System.out.println("<쇼핑몰 상품과 장바구니 시스템>");
//		24단계 (심화): 쇼핑몰 상품과 장바구니 시스템
//		문제:
//		    1. Product.java: 상품명(name), 가격(price)을 private 멤버와 Getter로 가집니다.
//		    2. Cart.java: Product 객체 배열(items, 크기 10)과 현재 담긴 개수(count)를
//		    멤버 변수로 가집니다.
//		    addProduct(Product p) 메서드와, 카트의 모든 상품 정보와 총액을 출력하는 displayCart()
//		    메서드를 구현합니다.
//		    3. Shopping.java의 main에서 여러 Product 객체를 만들고, while문을 통해 사용자에게
//		    상품 번호를 입력받아 Cart 객체에 추가합니다. '0'을 입력하면 displayCart()를
//		    호출하고 종료합니다.
//		핵심 사고: 서로 다른 역할을 하는 여러 클래스들이 상호작용하며 하나의 완성된 시스템을
//		구축하는 과정을 경험합니다.
//		힌트: 여러 클래스 설계, 객체 배열 관리, 객체 간 상호작용, while문, switch문, input
		Product [] arr = {new Product("딸기", 15000), // Product 객체 생성
				new Product("사과", 10000),
				new Product("배", 30000),
				new Product("바나나", 5000),
				new Product("우유", 4000),
				new Product("두부", 2000),
				new Product("계란", 12000),
				new Product("파", 1500),
				new Product("갈치", 30000),
				new Product("굴비", 25000),
				new Product("김치", 15000)};
		
		
		
		Cart c = new Cart();
		
		Scanner sc = new Scanner(System.in);
		int pNum = 100;
		
		while(pNum != 0) {
			System.out.println("--------상품목록--------");
//			for ( Product p : arr ) {
//				System.out.println(p); // 상품목록 출력
//			}
			for (int i = 0; i < arr.length; i++) {
			    System.out.println((i + 1) + ")" + arr[i]);
			}

			System.out.println();
			System.out.println("추가하실 상품의 번호를 입력하세요.> ");
			System.out.println("(종료를 원하시면 0을 입력해주세요.)");
			pNum = sc.nextInt();
			if (1 <= pNum && pNum <= arr.length) {
			c.addProduct(arr[pNum - 1]); // 상품 카트에 담기
			}
			else if (pNum != 0) {
				System.out.println("없는 번호입니다.");
				}
		}
		c.displayCart(); // 카트 목록 + 총 금액 출력
		sc.close();
	}

}
