package src1_210731;

class Cellphone{
	String model;
	String color;
	int capacity;
	
	//�Ű� ������ ������ �ִ� ������
	Cellphone(String model, String color, int capacity){
		this.model = model;
		this.color = color;
		this.capacity = capacity;
	}
	
	
	//�⺻ ������(���޵� ���� �ʵ带 ä��� ��)
	Cellphone(){
		
	}
}

public class constructor {
	public static void main(String [] main) {
		Cellphone myPhone1 = new Cellphone();
		Cellphone myPhone2 = new Cellphone("iphone", "white", 64);
		
		myPhone1.model = "galaxy";
		myPhone1.color = "blue";
		myPhone1.capacity = 64;
		
		System.out.println(myPhone1.model);
		System.out.println(myPhone2.model);
	}
}
