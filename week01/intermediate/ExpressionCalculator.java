package week01.intermediate;

import java.util.Scanner;

public class ExpressionCalculator {

	public static void main(String[] args) {
		System.out.println("<텍스트 기반 미니 계산기 업그레이드>");
//		18단계(응용): 텍스트 기반 미니 계산기 업그레이드
//		문제: 사용자가 "3 + 4", "10 * 2"와 같이 공백으로 구분된 계산식을 문자열로 입력하면,
//		이를 분석하여 계산 결과를 출력하는 프로그램을 작성하세요.
//		사용자가 "exit"을 입력할 때까지 계속 계산을 수행해야 합니다.
//		힌트: while문, break, String class(`split()`), 
//		switch문 또는 if-else if문, 자료형 변환
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("계산식을 입력하세요.>");
			System.out.println("(그만하고 싶으시면 exit를 입력해주세요.)");
			String calcInput = scanner.nextLine();
			
			if(calcInput.equals("exit")) {
				break;
			}
			
			String [] ch = calcInput.split(" ");
			int num1 = Integer.parseInt(ch[0]);
			int num2 = Integer.parseInt(ch[2]);
			String operator = ch[1];
			
			switch(operator){
				case "+":
					System.out.println(num1+" + "+num2+" = "+(num1+num2)); break;
				case "-":
					System.out.println(num1+" - "+num2+" = "+(num1-num2)); break;
				case "*":
					System.out.println(num1+" * "+num2+" = "+(num1*num2)); break;
				case "/":
					if(num2==0) {
						System.out.println("0으로 나눌 수 없습니다.");
					}
					else {
					System.out.println(num1+" / "+num2+" = "+((double)num1/num2));
					} break;
				case "%":
					if(num2==0) {
						System.out.println("0으로 나눌 수 없습니다.");
					}
					else {
					System.out.println(num1+" % "+num2+" = "+(num1%num2)); 
					} break;
				default:
					System.out.println("계산할 수 없는 식을 입력하셨습니다.");
			}
		}
		scanner.close();
	}

}