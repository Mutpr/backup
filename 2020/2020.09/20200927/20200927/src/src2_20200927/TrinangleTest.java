package src2_20200927;

import java.util.*;
public class TrinangleTest {

	static int row;
	static char alpha;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Shape.alpha = scan.next().charAt(0);
		scan.hasNextLine();
		Shape.row = scan.nextInt();
		Triangle triangle = new Triangle(row, alpha);
		Rectangle rectangle = new Rectangle(row, alpha);
		
	}

}
