/*
 * �ǽ� 1�� ���α׷��� while ���� �̿��ؼ� ���.
 * ���� �� �� �� �� �� ��for���� �̿��ؼ� �޾ƹ�������~
 */
package pack1_0716;

import java.util.*;
public class src2 { 
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); //Scanner �޾���.
		
		int a;
		a = scan.nextInt(); //A�� Ű����� �Է¹���.
		int i=1;
		
//		for (int i = 1; i<=a; i++) { //�������� �̿��ؼ� i�� a���� ���ų� ���� ��ŭ �����ϵ��� ��.
//			System.out.println("["+i+"]"); // for���� for(�ʱ�ȭ��->���ǽ�-> ������->���๮)
//		}
		
		while(i<=a) {
			System.out.println("["+i+"]"); //while�� �ʱ�ȭ��-> while(���ǽ�)->������  ������ �������.
			i++; 
			//�ʿ信 ���� �����İ� ������� ������ ���� �� �ִ�! �������� ���� ���� +�� -�� �� ���� ����ǹǷ� �÷����� ���̳ʽ��� �Ǿ��ִ� ���°� �ȴ�.
		}
		
	}

}
