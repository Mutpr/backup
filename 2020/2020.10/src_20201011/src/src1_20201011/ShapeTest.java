package src1_20201011;

import java.util.*;
public class ShapeTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		System.out.println("1. 원넓이 2. 사각형넓이 3. 종료>>");
		
		switch(select = scan.nextInt()) {
		case 1:
			System.out.println("반지름을 입력하세요.");
			double radius = scan.nextDouble();
			Circle circle = new Circle(radius);
			circle.area();
			circle.write();
			break;
		case 2:
			System.out.println("가로와 세로를 입력하세요.");
			System.out.print("가로>>");
			double d1 = scan.nextDouble();
			System.out.print("세로>>");
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
