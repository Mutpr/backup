package src3;

import java.util.*;
public class BookTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Book book = new Book();
		
		System.out.println("����� �����̸� �Է��ϼ���: ");
		book.setAuthor(scan.nextLine());
		book.setName(scan.nextLine());
		System.out.println(book.toString());
	}

}
