package week02.advanced;

public class Computer {
	
	private int[] answer = new int [3];
	
	public Computer(){
		
	}
	
	public int[] createAnswer() {
		
		for (int i = 0; i < answer.length; i++) {
			while (true) {
				int num = (int)(Math.random()*9+1); // 1~9
				boolean dup = false;
				for (int j = 0; j < i; j++) {
					if (answer[j] == num) {
						dup = true; // while문 빠져나가기
						break; // 바깥 for문으로
					}	
				}
					if (!dup) {
						answer[i] = num; // 중복이 아니면 배열에 넣기
						break;
				}
			}
		}
		return answer;
	}

	public int[] getAnswer() {
		return answer;
	}	
	
//	23단계 (심화): 숫자 야구 게임의 완전한 책임 분리
//	문제: 1주차 14번 숫자 야구 게임을 세 개의 클래스로 분리하여 재설계하세요.
//	    1. Computer.java: 정답 숫자를 생성하고(createAnswer()) 보관하는 역할(int[] answer).
//	    2. Referee.java: Computer의 정답과 User의 추측을 비교하여 스트라이크/볼을 판정하는
//	    judge(int[] answer, int[] guess) static 메서드를 가진 역할.
//	    3. BaseballGame.java: main 메서드를 포함하며, Computer 객체를 만들고
//	    while 루프를 돌며 사용자 입력을 받아 Referee를 통해 결과를 얻고 출력하는 게임 진행의 역할.
//	핵심 사고: 프로그램의 책임과 역할을 기준으로 클래스를 명확하게 분리하여(관심사의 분리),
//	코드의 재사용성과 유지보수성을 높이는 설계를 학습합니다.
//	힌트: 클래스 분리, 객체 간의 협력, static 메서드, while문, input, 배열
}
