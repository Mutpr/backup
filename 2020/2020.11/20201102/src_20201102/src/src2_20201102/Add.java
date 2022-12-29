package src2_20201102;

public class Add implements Calculator.Control{
	public void run(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}
}
