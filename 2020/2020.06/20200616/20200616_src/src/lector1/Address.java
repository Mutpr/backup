package lector1;

public class Address {
	private String name; //이름
	private String phone; //연락처
	
	public Address(String na, String ph) {
		name = na;
		phone = ph;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phone);
	}
}
