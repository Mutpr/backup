package src2_20200919;

import java.util.*;
public class BooKTest {

	public static void main(String[] args) {
		Book[] book= {new Book("자바", 150, 2016), 
			new Book("파이썬", 100, 2019), 
			new Book("자바스크립트", 200, 2018)};
				Scanner in=new Scanner(System.in);
				System.out.print("검색하고자 하는 제목을 입력하세요 >> ");
				String title=in.nextLine();
	}

}
