package src2;

import java.util.*;
public class BoxTest {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		Box box = new Box();
		
		System.out.println("���θ� �Է��ϼ���: ");
		box.garo = scan.nextInt();
		System.out.println("���θ� �Է��ϼ���: ");
		box.sero = scan.nextInt();
		System.out.println("���̸� �Է��ϼ���: ");
		box.length = scan.nextInt();
		System.out.println("����: "+box.garo+"\n"+"����: "+box.sero+"\n"+"����: "+box.length);
		box.volume();
	}
}
