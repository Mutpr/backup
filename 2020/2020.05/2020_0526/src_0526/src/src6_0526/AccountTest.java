package src6_0526;

import java.util.*;
public class AccountTest {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		
		Account act = new Account("243-54-654", 100000);
		System.out.println(act.toString());		
		
		System.out.println("입금액>>>> ");
		int money = scan.nextInt();
		act.deposit(money);
		System.out.println(act.toString());
		
		System.out.println("출금액>>>> ");
		money = scan.nextInt();
		boolean b = act.pay(money);
		
		System.out.println(b? act.toString():"잔액 부족");
		System.out.println("프로그램을 종료합니다.");
		
	}
}
