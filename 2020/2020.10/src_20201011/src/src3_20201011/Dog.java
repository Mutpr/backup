package src3_20201011;

public class Dog extends Animal{
	
	public Dog(String type) {
		super(type);
	}
	@Override
	public void run() {
		System.out.println("������: �׹߷� �ٴմϴ�.");
	}
	@Override
	public void sound() {
		System.out.println("������: �۸� �Ҹ��� ���ϴ�.");
	}
}
