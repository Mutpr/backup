package src4;

import java.util.*;
public class InfoTest {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Info info1 = new Info();
		Info info2 = new Info();
		
		System.out.println("아이디를 입력하세요>> ");
		info1.id = scan.nextLine();
		System.out.println("첫번째 객체 생성 완료");
		
		System.out.println("아이디를 입력하세요>> ");
		info2.id = scan.nextLine();
		System.out.println("두번째 객체 생성 완료");
		
//		info1.pass = (int)(Math.random()*10000);
//		info2.pass = (int)(Math.random()*10000);
//		
		System.out.println("첫번째 객체의 아이디와 비밀번호 출력");
		info1.disPlay();
		
		System.out.println("두번째 객체의 아이디와 비밀번호 출력");
		info2.disPlay();
		
	}
}
