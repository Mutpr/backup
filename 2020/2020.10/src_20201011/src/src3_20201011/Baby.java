package src3_20201011;

public class Baby extends Animal{
	
	public Baby(String type) {
		super(type);
	}
	
	@Override
	public void run() {
		System.out.println("�Ż���: ��� �ٴմϴ�.");
	}

	@Override
	public void sound() {
		System.out.println("�Ż���: �˾��̸� �մϴ�.");
	}
}
