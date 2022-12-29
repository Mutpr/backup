package src3_20201012;

public class Hair implements Operation{
	private String type;
	
	public Hair(String type) {
		this.type = type;
	}
	
	static void tint(String color) {
		System.out.println(color+" 색으로 염색하다.");
	}

	@Override
	public void cut() {
		System.out.println(type +" 를 자르다.");
		
	}

	@Override
	public void wash() {
		System.out.println(type+" 를 씻다.");
		
	}
}
