package src2_20201102;

public class Exp implements Calculator.Control{
	public void run(int a, int b) {
		int result = 1; 
		for(int i=0; i<b; i++) {
			result*=a;
		}System.out.println(a+"*"+b+"="+result);
	}
}
