package src3;

import java.util.*;
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Circle circle = new Circle();
		
		int menu;
		
		System.out.println("반지름을 입력하시오>>");
		circle.radius = scan.nextDouble();
		System.out.println("1.넓이, 2. 원둘레 >> 선택: ");
		
		switch(menu = scan.nextInt()){
		case 1:
			circle.getArea();
			break;
		case 2: 
			circle.getCircum();
			break;
		default:
			System.out.println("해당 메뉴 없음.");
			break;
				
		}
	}

}
