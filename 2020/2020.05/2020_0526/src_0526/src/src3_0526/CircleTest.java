package src3_0526;

import java.util.*;
public class CircleTest {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		circle cir = new circle();
		
		System.out.print("�������� �Է��ϼ���>>");
		cir.pi = scan.nextDouble();
		System.out.print("1.����, 2.���ѷ�>> ����:");
		int select = scan.nextInt();
		if(select == 1) {
			cir.getArea(cir.pi);
		}else if (select == 2) {
			cir.getCircum(cir.pi);
		}else {
			System.out.println("�ش� �޴� ����");
		}
	}
}
