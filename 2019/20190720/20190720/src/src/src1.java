package src;

import java.util.*;
public class src1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		//int b = sc.nextInt();
		
		for(int i=0; i<=a; i++) { //���� ��µ� ��ġ(�ٷ� �Է��� �� a��ŭ�� �ݺ�)
			for(int j=0; j<=i; j++) { //���� ��µ� �� (i ��ŭ�� �ݺ�)
				System.out.print("*"); //*�� �������
			}
			System.out.println(); //������ �����
		}
			
		
	}

}
