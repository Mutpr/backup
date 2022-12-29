/*
 * 키보드로 while문 제어
 * 키보드로 입력한 3개의 속도 감지 -> 감속, 증속, 종료 평가
 * if문을 사용해서 처리.
 */
package pack_0716;

public class src3 {
	public static void main(String args[]) throws Exception {
		
		boolean run = true;
		int speed = 0;
		int KeyCode = 0;
		
		while(run) {
			if(KeyCode != 10 && KeyCode != 13) {
				
		}
			 System.in.read(); //키보드의 키코드 값을 읽어서 리턴하는 것. (io 입출력)
			System.out.println(KeyCode); //입력된 키가 키코드로 저장됨.
		} //int keycode 를 통해서 인트를 설정 할 수 있게 됨. 오류 뜨는 이유는 예외처리가 되지 않아서. 
			//이 상태로 출력하면 키코드+ 13과 10이 같이 출력됨. 13번은 캐리지 리턴, 10은 라인피드.
	}
		
}
