package src2_20200927;

public class Rectangle extends Shape{
	
	public Rectangle(int ro, char ap) {
		super(ro, ap);
	}
	public void draw() {
		for(int i=0;i<3;i++){
		for(int j=0;j<4;j++){
			System.out.print("*");
		}
		System.out.println("");
	}
	
	}
}

