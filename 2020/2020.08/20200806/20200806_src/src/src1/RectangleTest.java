package src1;

import java.util.*;
public class RectangleTest {
	public static void main(String args[]) {
		Rectagle rec = new Rectagle();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���θ� �Է��ϼ���>> ");
		rec.length = scan.nextDouble();
		System.out.println("���θ� �Է��ϼ���>> ");
		rec.height = scan.nextDouble();
		rec.Area();
		
	}
}
