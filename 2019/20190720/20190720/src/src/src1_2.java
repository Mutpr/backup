package src;

import java.util.*;
public class src1_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) { // ���� ���� ��ŭ ����Ǿ� �ϹǷ� i<a�� ������ش�.
			//i<a�� ������ a�� ���������� �ݺ��Ǹ� ���̺��� �ѹ� �� ����Ǽ�!
			for(int j=a-1; j>i; j--) { //������ ����(���� �ٸ��� �ϳ��� �پ�� �ؼ� --��)
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) { //���� ����
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
