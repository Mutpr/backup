package src3_20201012;

public class Fruit implements Operation{
	private String type;
	
	public Fruit(String type) {
		this.type = type;
	}

	static void pack(String cnt) {
		System.out.println(cnt+"개 만큼 포장하다.");
	}

	@Override
	public void cut() {
		System.out.println(type+" 를 자르다.");
	}

	@Override
	public void wash() {
		System.out.println(type+" 를 씻다.");

		
	};
}
