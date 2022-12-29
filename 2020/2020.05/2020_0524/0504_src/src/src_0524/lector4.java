package src_0524;

public class lector4 {
	public static int big(int a, int b) {
		return (a>b)? a:b;
	}
	
	public static void write(String message, int value) {
		System.out.println(message+value);
	}
	
	public static void main(String [] args) {
		int d1 = (int) (Math.random()*15)+1;
		int d2 = (int) (Math.random()*15)+1;
		int max = big(d1, d2);
		
		write("积己等 抄荐1:",d1);
		write("积己等 抄荐2:",d2);
		write("max:", max);
	}
}
