package src;

import java.util.*;
public class src1 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int [] array1 = new int [N];
		
//		int max = array1[0];
//		int min = array1[0];
//		int value;
		
		for(int i = 0; i<N; i++) {
			array1[i] = scan.nextInt();
			
	}
		Arrays.sort(array1);
		System.out.println(array1[0]);
		System.out.println(array1[N-1]);
}
}
