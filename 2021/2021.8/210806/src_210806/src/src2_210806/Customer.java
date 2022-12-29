package src2_210806;

public class Customer extends Person{
	String number;
	String mileage;
	
	public Customer(String name, String address, String tel) {
		super(name, address, tel);
	}
	
	public void getNumber(String number) {
		this.number = number;
	}
	
	public String setNumber() {
		return number;
	}
	
	public void getMileage(String mileage) {
		this.mileage = mileage;
	}
	
	public String setMileage() {
		return mileage;
	}
	
	public String toString() {
		return "마일리지:"+mileage+"/n"+"고객번호:"+number;
	}

}
