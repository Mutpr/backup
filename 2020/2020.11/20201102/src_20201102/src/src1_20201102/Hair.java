package src1_20201102;

public class Hair extends Tool{
	private String style;
	
	public Hair(String type, String style) {
		super(type);
		this.style = style;
	}
	
	void tint(String color) {
		System.out.println(super.getType()+color+" 색으로 염색합니다");
	}
	
	@Override
	public void cut() {
		System.out.println(super.getType()+" 을 자르다.");
	}
	
	@Override
	public void dry() {
		System.out.println(super.getType()+" 을 말리다.");
	}
	
	@Override
	void write() {
		super.write();
		System.out.println("Style>> "+style);
	}
	}
