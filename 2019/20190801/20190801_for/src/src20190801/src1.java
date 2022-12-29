/*
 * 팩토리얼 계산하는 프로그램 만들기
 */
package src20190801;

import java.util.*;

public class src1 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		long fact = 1; //팩토리얼은 상당히 길어질 수 있기 때문에 long형으로 받아줌.
		int a = sc.nextInt(); //a!
		
		for(int i=1; i<=a; i++) {
			fact = fact*i;
		 //팩토리얼은 1에서부터 입력받은 수를 계속 더하기 때문에 받은 숫자가 될때까지 곱해줌.
		} System.out.println(fact);
		 
		
	}

}
