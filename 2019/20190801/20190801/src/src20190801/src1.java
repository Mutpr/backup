/*
 * ���丮�� ����ϴ� ���α׷� �����
 */
package src20190801;

import java.util.*;

public class src1 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		long fact = 1; //���丮���� ����� ����� �� �ֱ� ������ long������ �޾���.
		int a = sc.nextInt(); //a!
		
		for(int i=1; i<=a; i++) {
			fact = fact*i;
		 //���丮���� 1�������� �Է¹��� ���� ��� ���ϱ� ������ ���� ���ڰ� �ɶ����� ������.
		} System.out.println(fact);
		 
		
	}

}
