/*
 * �ִ����� ã��
 * 1) �� �� ��� ū ���� x, ���� ���� y�� �Ѵ�.
 * 2) y�� 0�̸� ������� x�� ����
 * 3) r <- x%y
 * 4) x <- y
 * 5) y <- r
 * 6) �ܰ� 2�� �ǵ��ư�.
 */
package src_20190801;

import java.util.*;

public class src2 {
	public static void main(String args[]) {//���� �޼ҵ�
		Scanner sc = new Scanner(System.in); // ��ĳ�� ��ü
		int a,b,tmp;
		//int uc;
		System.out.println("�� ������ �Է��Ͻÿ�:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		do{
			if(a<b) {
				tmp = b;	//num2(ū ��)�� temp��,
				a = b;	//num1(���� ��)�� num2��,
				a = tmp;	//��������� temp(ū ��)�� num1�� ����
			}
		} while(b!=0);{
				System.out.println(a);					//num1>num2�̸� �׳� �ٷ� �Ʒ� ����� ����
			
			
			}
	}
}
