package ex1_220109;

import java.util.*;

public class ex1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ex1_method method = new ex1_method();

		System.out.println("요솟수: ");
		int num = scan.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			x[i] = scan.nextInt();
		}
		System.out.println("검색값: ");
		int key = scan.nextInt();

		int xd = method.seqsearch(x, num, key);
		if(xd == 1) {
			System.out.println("찾는값 있습니다.");
		}else {
			System.out.println("찾는값 없습니다.");
		}
		
		method.indexsearch(x, num, key);
		scan.close();
	}

}
