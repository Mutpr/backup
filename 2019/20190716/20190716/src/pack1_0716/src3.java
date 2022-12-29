/*
 * 1부터 10까지의 숫자 중 홀수만 골라 출력하는 프로그램을 작성하시오.
 */
package pack1_0716;

import java.util.*;
public class src3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a;
		a = scan.nextInt();
		
		for(int i=1; i<=a; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
			
		}
	}
	

}
