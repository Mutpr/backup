package src1_20200810;

class Melon extends Food {
	//���� ��� ����
	private String farm;
	
	public Melon(int pr, double wei, String fa) {
		super(pr,wei);
		farm = fa;
	}
	
	public void ShowInfo() {
		super.ShowInfo();
		System.out.println("����: "+ farm);
	}
	
	
}
