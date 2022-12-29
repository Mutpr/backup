package src1_20201012;

public class Answer_01 {

	public static void main(String[] args) {
		Action act = new Action() {
			public void move() {
				System.out.println("나는 걷습니다.");
			} 
		};
		
		Action Sing = () -> {
			System.out.println("나는 노래합니다.");
		};
		
		act.move();
		Sing.move();
	}
	}

