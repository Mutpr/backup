package src1;

import java.util.*;
public class RectangleTest {
	public static void main(String args[]) {
		Rectagle rec = new Rectagle();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가로를 입력하세요>> ");
		rec.length = scan.nextDouble();
		System.out.println("세로를 입력하세요>> ");
		rec.height = scan.nextDouble();
		rec.Area();
		
	}
}
