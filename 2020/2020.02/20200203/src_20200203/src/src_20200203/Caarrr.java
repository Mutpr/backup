package src_20200203;

public class Caarrr {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Caarrr(){
		
	}
	
	Caarrr(String model){
		this(model,"����", 250);
	}
	
	Caarrr(String model, String color){
		this(model, color, 250);
	}
	
	Caarrr(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
