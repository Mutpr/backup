package src2_20200608;

import java.util.*;
public class personTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		person p = new person();
		
		System.out.println("이름과 출생 년도를 입력하세요.");
		
		p.setPerson(scan.nextLine());
		p.getYear(scan.nextInt());
		
		p.getPerson();
		p.checkMask();
		
	}

}
