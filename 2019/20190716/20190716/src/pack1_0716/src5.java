/*
 * Ű����κ��� 1���� 9������ ������ �޾� �������� ����ϴ� ���α׷��� ����ÿ�.
 */
package pack1_0716;

import java.util.*;

public class src5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է��Ͻÿ�:");
		int a;
		a = scan.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}
	}

}
