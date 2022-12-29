/*
 * package src20190801;

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
 */

/*
 * 로또 확률 계산
 * 
 */
package src_20190804;

import java.util.*;

public class src2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int odds = 1;
		final int n = 45; //로또번호 숫자
		int k = 6;
;//6개 항목
		
		for(int i=1; i<=k; i++) {
			odds = odds * (n-i+1 )/i;
		}
		System.out.println("로또 1등 확률: 1/" + odds);
		
	}

}
