package src1_20201102;

public abstract class Tool {
	private String type;
	public Tool(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	void write() {
		System.out.println("type>>"+type);
	}
	
	abstract public void cut();
	abstract public void dry();
}
