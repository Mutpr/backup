package src_0805;

import java.util.*;

public class src1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double mother = 4.0;
		double son = 1.0;
		double sum = 0.0;
		int loop_count = sc.nextInt();
		
		while(loop_count > 0) {
			sum = sum + mother/son;
			son = -1.0*son;
			mother = mother + 2.0;
			--loop_count;
		}
		System.out.println(sum);
	}

}
