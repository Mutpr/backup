package src4;

import java.util.*;
public class InfoTest {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Info info1 = new Info();
		Info info2 = new Info();
		
		System.out.println("���̵� �Է��ϼ���>> ");
		info1.id = scan.nextLine();
		System.out.println("ù��° ��ü ���� �Ϸ�");
		
		System.out.println("���̵� �Է��ϼ���>> ");
		info2.id = scan.nextLine();
		System.out.println("�ι�° ��ü ���� �Ϸ�");
		
//		info1.pass = (int)(Math.random()*10000);
//		info2.pass = (int)(Math.random()*10000);
//		
		System.out.println("ù��° ��ü�� ���̵�� ��й�ȣ ���");
		info1.disPlay();
		
		System.out.println("�ι�° ��ü�� ���̵�� ��й�ȣ ���");
		info2.disPlay();
		
	}
}
