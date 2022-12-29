package src_0603;

import java.util.*;
public class src1 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		scan.close();
		
		int [] counts = new int[10];
		int number = A*B*C;
		
		while(number>0) {
			counts[number%10]++;
			number/=10;
		}
		
		for(int i = 0; i<=counts.length-1; i++) {
			System.out.println(counts[i]);
		}
	}
}
