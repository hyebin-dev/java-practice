package week02.intermediate;

public class Timer {
	
	private int second;
	
	public void setSecond(int second) {
		if( second > 59 || second < 0 ) {
			System.out.println("잘못된 초(second) 값입니다.");
			return; // 메서드 즉시 종료
		}
		this.second = second; // 통과 시에만 대입
	}
	
    public int getSecond() {
        return second;
    }
    
	public static void main(String[] args) {
		System.out.println("<유효성 검사가 포함된 Setter>");
//		18단계(응용): 유효성 검사가 포함된 Setter
//		문제: Timer.java 클래스에 private int second (0~59) 멤버 변수를 만드세요.
//		setSecond(int s)Setter 메서드 내부에, 매개변수로 들어온 s가 0~59 범위를 벗어나면
//		"잘못된 초(second) 값입니다."를 출력하고 값을 변경하지 않는 유효성 검사 로직을 추가하세요.
//		핵심 사고: Setter를 이용해 클래스 내부의 데이터가 비정상적인 값으로 오염되는 것을 방지하는 방법을 익힙니다.
//		힌트: setter, private, if문, 논리 연산자(||)
        Timer t = new Timer();
        t.setSecond(30);
        System.out.println(t.getSecond());
        t.setSecond(70); // 잘못된 값
        System.out.println(t.getSecond()); // 잘못된 값은 저장되지 않음.
    }
}
