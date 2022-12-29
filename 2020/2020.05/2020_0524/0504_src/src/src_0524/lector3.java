package src_0524;

import java.util.*;
public class lector3 {
	public static int digit_input(String prompt) {
		Scanner scan = new Scanner(System.in);
		System.out.print(prompt);
		return scan.nextInt();
	}
	
	public static void main(String [] args) {
		int year = digit_input("태어난 년도 입력");
		int month = digit_input("몇 월 생입니까?>>");
		System.out.println(year+"년"+month+"월 생 입니다.");
	}
}
