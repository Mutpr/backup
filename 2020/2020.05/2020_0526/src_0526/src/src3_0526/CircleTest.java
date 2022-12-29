package src3_0526;

import java.util.*;
public class CircleTest {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		circle cir = new circle();
		
		System.out.print("반지름을 입력하세요>>");
		cir.pi = scan.nextDouble();
		System.out.print("1.넓이, 2.원둘레>> 선택:");
		int select = scan.nextInt();
		if(select == 1) {
			cir.getArea(cir.pi);
		}else if (select == 2) {
			cir.getCircum(cir.pi);
		}else {
			System.out.println("해당 메뉴 없음");
		}
	}
}
