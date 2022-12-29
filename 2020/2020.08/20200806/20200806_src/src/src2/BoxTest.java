package src2;

import java.util.*;
public class BoxTest {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		Box box = new Box();
		
		System.out.println("가로를 입력하세요: ");
		box.garo = scan.nextInt();
		System.out.println("세로를 입력하세요: ");
		box.sero = scan.nextInt();
		System.out.println("높이를 입력하세요: ");
		box.length = scan.nextInt();
		System.out.println("가로: "+box.garo+"\n"+"세로: "+box.sero+"\n"+"높이: "+box.length);
		box.volume();
	}
}
