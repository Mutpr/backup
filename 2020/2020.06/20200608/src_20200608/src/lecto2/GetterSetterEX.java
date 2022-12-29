package lecto2;

public class GetterSetterEX {
	
	private int speed;
	private int mileage;
	
	public GetterSetterEX(int s, int m) {
		speed = s;
		mileage = m;
	}
	
	public void print(String str) {
		System.out.println("[¼Óµµ: "+ speed+ "\t" + "mileage: "+mileage + "]");
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void setSpeed(int speed) {
		if(speed>0)
			this.speed = speed;
		else
			this.speed = 0;
	}
	
	public void setMileage(int Mileage) {
		this.mileage = mileage;
	}
	
}
