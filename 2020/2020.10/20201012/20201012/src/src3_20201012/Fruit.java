package src3_20201012;

public class Fruit implements Operation{
	private String type;
	
	public Fruit(String type) {
		this.type = type;
	}

	static void pack(String cnt) {
		System.out.println(cnt+"�� ��ŭ �����ϴ�.");
	}

	@Override
	public void cut() {
		System.out.println(type+" �� �ڸ���.");
	}

	@Override
	public void wash() {
		System.out.println(type+" �� �Ĵ�.");

		
	};
}
