package src1_20201011;

import java.util.*;
public class ShapeTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		System.out.println("1. ������ 2. �簢������ 3. ����>>");
		
		switch(select = scan.nextInt()) {
		case 1:
			System.out.println("�������� �Է��ϼ���.");
			double radius = scan.nextDouble();
			Circle circle = new Circle(radius);
			circle.area();
			circle.write();
			break;
		case 2:
			System.out.println("���ο� ���θ� �Է��ϼ���.");
			System.out.print("����>>");
			double d1 = scan.nextDouble();
			System.out.print("����>>");
			double d2 = scan.nextDouble();
			rectangle rect = new rectangle(d1,d2);
			rect.area();
			rect.write();
			break;
		case 3:
			break;
		}
		
	}

}
