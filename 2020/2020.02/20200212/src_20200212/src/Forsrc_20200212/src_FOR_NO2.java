/*
 * 두 정수 A와 B를 입력 받은 다음, A+B를 
 */

package Forsrc_20200212;

import java.util.*;
public class src_FOR_NO2 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		for(int k = 1; k<=number; k++) { 
			int i = scan.nextInt();
			int j = scan.nextInt();
			System.out.println(i+j);
		}
	}

}
