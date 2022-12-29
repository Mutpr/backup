package src_0603;

import java.util.*;
public class src2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int counts[] = new int[10];
		//int key = scan.nextInt();
		int reason; 
		int result = 0;
		
		for(int i = 0; i<=counts.length-1; i++) {
			counts[i] = scan.nextInt();
			reason = counts[i]%42;
			if(counts[i]!=counts[i+1]) {
				result++;
			}
			
		}System.out.println(result);
	}

}
