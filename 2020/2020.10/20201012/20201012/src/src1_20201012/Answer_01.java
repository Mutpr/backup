package src1_20201012;

public class Answer_01 {

	public static void main(String[] args) {
		Action act = new Action() {
			public void move() {
				System.out.println("���� �Ƚ��ϴ�.");
			} 
		};
		
		Action Sing = () -> {
			System.out.println("���� �뷡�մϴ�.");
		};
		
		act.move();
		Sing.move();
	}
	}

