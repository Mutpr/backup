package src1_20201102;

public class Paper extends Tool{
	private String size;
	public Paper(String type, String size) {
		super(type);
		this.size = size;
	}
	
	void draw() {
		System.out.println(super.getType()+"에 그림을 그리다");
	}
	
	@Override
	public void write() {
		super.write();
		System.out.println("size>> "+size);
	}
	
	@Override
	public void cut() {
		System.out.println("종이를 자르다");
	}
	
	@Override
	public void dry() {
		System.out.println("종이를 말리다");
	}
}
