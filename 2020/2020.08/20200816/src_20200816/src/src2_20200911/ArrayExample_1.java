package src2_20200911;

import java.util.*;
public class ArrayExample_1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double value [] = new double[10];
		
		for(int i = 0; i<=value.length-1; i++) {
			value[i] = scan.nextDouble();
		}
		for(double j:value) {
			System.out.println(j);
		}
	}
}
