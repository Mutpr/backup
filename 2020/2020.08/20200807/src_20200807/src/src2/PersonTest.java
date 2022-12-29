package src2;

import java.util.*;
public class PersonTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Person per = new Person();
		
		per.setName(scan.nextLine());
		System.out.print("이름: "+per.getName());
		System.out.print("\t"+"태어난 년도: "+per.getYear());
		per.checkMask();
		
		
	}

}
