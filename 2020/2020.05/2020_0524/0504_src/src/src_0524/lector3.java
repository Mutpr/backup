package src_0524;

import java.util.*;
public class lector3 {
	public static int digit_input(String prompt) {
		Scanner scan = new Scanner(System.in);
		System.out.print(prompt);
		return scan.nextInt();
	}
	
	public static void main(String [] args) {
		int year = digit_input("�¾ �⵵ �Է�");
		int month = digit_input("�� �� ���Դϱ�?>>");
		System.out.println(year+"��"+month+"�� �� �Դϴ�.");
	}
}
