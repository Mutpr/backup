package src1_20201011;

public class rectangle extends Shape{
	private double d1, d2;
	
	public rectangle(double d1, double d2) {
		this.d1=d1;
		this.d2=d2;
	}
	
	@Override
	public double area() {
		return d1* d2;
	}
	
	@Override
	public void write() {
		System.out.println("Rectangle[ga="+d1+"\tes="+d2);
		System.out.printf("\tarea =  %.2f] \n", area());
				
	}
	
}
