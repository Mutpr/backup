package src2_0526;

import java.util.*;
public class BoxTest {
	public static void main(String[] args) {
		 //Box 클래스 객체  선언 – 본인 작성
		 //객체 생성 - 입력 받은 값을 생성자 매개변수로 전달하여 필드 초기화  – 본인 작성
	     //volume() 메소드 호출 – 본인 작성
		Scanner scan = new Scanner(System.in);
		Box box = new Box();
		
		System.out.println("가로를 입력하세요>>");
		box.garo = scan.nextInt();
		System.out.println("세로를 입력하세요>>");
		box.sero = scan.nextInt();
		System.out.println("높이를 입력하세요>>");
		box.height = scan.nextInt();
		
		box.volume();
		
	}

}
