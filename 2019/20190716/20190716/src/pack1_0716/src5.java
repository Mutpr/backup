/*
 * 키보드로부터 1부터 9사이의 정수를 받아 구구단을 출력하는 프로그램을 만드시오.
 */
package pack1_0716;

import java.util.*;

public class src5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단을 입력하시오:");
		int a;
		a = scan.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}
	}

}
