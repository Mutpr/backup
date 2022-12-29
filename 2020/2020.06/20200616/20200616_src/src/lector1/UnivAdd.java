package lector1;

class UnivAdd extends Address {
	private String major;
	
	public UnivAdd(String na, String ma, String ph) {
		super(na, ph);
		major = ma;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Àü°ø: "+major);
	}
}
