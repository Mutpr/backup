package src_20200203;

public class Caarrr {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Caarrr(){
		
	}
	
	Caarrr(String model){
		this(model,"은색", 250);
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
