/*
 * ����ڷκ��� ���̿� ���̸� �Է¹޾� ��ø�� �ݺ����� �̿��ؼ� ������ ������ ����Ͻÿ�.
 */
package pack1_0716;

import java.util.*;

public class src6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		//�簢��
		for(int i=1; i<=a; i++) { //i�� a���� ���ų� ���������� �ݺ��Ѵ�.
			for(int j=1; j<=b; j++) //j�� b���� ���ų� ���������� �ݺ��Ѵ�.
			System.out.print("*"); //*�� a��ŭ ���� ���
			System.out.println();//���ٶ��⸦ b��ŭ �ݺ��Ѵ�.
		}
		
		
	}
}
