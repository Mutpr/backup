package src2;

import java.util.*;
public class PersonTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Person per = new Person();
		
		per.setName(scan.nextLine());
		System.out.print("�̸�: "+per.getName());
		System.out.print("\t"+"�¾ �⵵: "+per.getYear());
		per.checkMask();
		
		
	}

}
