/*
 * for 문을 이용해서 약수를 계산하는 프로그램 작성.
 */
package src20190801;

import java.util.*;
public class src2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				System.out.print(" "+i);
			}
		}
	}
}
