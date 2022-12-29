package src_0526;

import java.util.*;
public class src1 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		Rectangle rec = new Rectangle();
            //Rectangle 클래스 rec 선언 & 생성
		System.out.println("가로를 입력하세요 >> ");
			rec.a = scan.nextDouble();
          //입력 받은 값을 가로 필드로 초기화
		System.out.println("세로를 입력하세요 >> "); 
			rec.b = scan.nextDouble();
         //입력 받은 값을 세로 필드로 초기화
          //area()  호출
			rec.area();

	}
}






