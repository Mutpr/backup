package lector1;

public class Address {
	private String name; //�̸�
	private String phone; //����ó
	
	public Address(String na, String ph) {
		name = na;
		phone = ph;
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ: " + phone);
	}
}
