package src6_0526;

import java.util.*;
public class AccountTest {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		
		Account act = new Account("243-54-654", 100000);
		System.out.println(act.toString());		
		
		System.out.println("�Աݾ�>>>> ");
		int money = scan.nextInt();
		act.deposit(money);
		System.out.println(act.toString());
		
		System.out.println("��ݾ�>>>> ");
		money = scan.nextInt();
		boolean b = act.pay(money);
		
		System.out.println(b? act.toString():"�ܾ� ����");
		System.out.println("���α׷��� �����մϴ�.");
		
	}
}
