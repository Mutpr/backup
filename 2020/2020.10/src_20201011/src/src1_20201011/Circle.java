package src1_20201011;

public class Circle extends Shape{
	static final double PI = 3.14;
	double r;
	
	public Circle(double r) {
		this.r=r;
	}
	
	public double getRadius() {
		return r;
	}
	
	@Override
	public double area() {
		return r * r * PI;
	}
	
	@Override
	public void write() {
		System.out.print("Circle [radius" + r);
		System.out.printf("\tarea = %.2f]\n", area());
	}
}
