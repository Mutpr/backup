package src_20190802;

import java.util.*;

public class prac0802_5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 | 2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			System.out.println("선택>");
			
			int menuNum = sc.nextInt();//제어문
			int depos =0;
			int number=0;
			
			switch(menuNum) {
			case 1: //예금액 입력
				System.out.print("예금액>");
				balance += sc.nextInt();
				break;
				
			case 2://출금액 입력
				System.out.print("출금액>");//출금액
				balance -= sc.nextInt(); //읽고나서 잔고에서 빼서 저장
				break;
				
			case 3://잔고 출력
				System.out.print("잔고>");
				System.out.println(balance);
				break;
				
			case 4:
				run = false; //4번을 선택하면 false가 되서 while문을 빠져나가게 함!
				break; //굳이 안 넣어줘도 됨!
			}
			System.out.println();
		}
		System.out.println("시스템 종료");
	}
}
