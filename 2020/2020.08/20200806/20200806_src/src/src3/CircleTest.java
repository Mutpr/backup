package src3;

import java.util.*;
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Circle circle = new Circle();
		
		int menu;
		
		System.out.println("�������� �Է��Ͻÿ�>>");
		circle.radius = scan.nextDouble();
		System.out.println("1.����, 2. ���ѷ� >> ����: ");
		
		switch(menu = scan.nextInt()){
		case 1:
			circle.getArea();
			break;
		case 2: 
			circle.getCircum();
			break;
		default:
			System.out.println("�ش� �޴� ����.");
			break;
				
		}
	}

}
