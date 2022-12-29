package src_0524;

import java.util.*;
public class src2 {
	public static void main(String []args) {
		int total = 0;
		int count = input("인원수를 입력하세요 >> "); // input() 호출
		for (int i = 0; i < count; i++) {
			int rnd = (int) (Math.random() * 5) + 1;
			int value = valueAt(rnd); // valueAt() 메소드 호출, 가격을 반환받는다
			String menu = menuAt(rnd); // menuAt() 메소드 호출, 메뉴를 반환받는디
			System.out.println("난수 : " + rnd + ", 메뉴 : " + menu + ", 가격 : " + value);
			total += value;
		}

		int money = input("주문합계 : " + total + "  >> "); // input() 호출, 사용자로부터 받은 돈을 반환
		System.out.println("받은 돈 : " + money);
		System.out.println(money - total != 0 ? "거스름 돈 : " + (money - total) : "거스름 돈 없음");
	}

	public static String menuAt(int rnd) {
		// menuAt() 메소드 선언 - 생성된 난수를 매개변수로 받아 메뉴를 반환하는 메소드
		switch(rnd) {
		case 1:
			return "카푸치노";
		case 2:
			return "에스프레소";
		case 3:
			return "아메리카노";
		case 4:
			return "카페라떼";
		case 5:
			return "자몽에이드";
		}
		return null;
	}

	public static int valueAt(int rnd) {
		// valueAt() 메소드 선언 - 생성된 난수를 매개변수로 받아 가격을 반환하는 메소드
		switch(rnd) {
		case 1:
			return 3000;
		case 2:
			return 2000;
		case 3:
			return 2500;
		case 4:
			return 3500;
		case 5:
			return 4000;
		}
		return rnd;
	}

	public static int input(String string) {
		// input() 메소드 선언 -프롬프트 문자열을 매개변수로 받으며 
		//메소드에서 입력 받은 정수를 반환하는 메소드
		Scanner scan = new Scanner(System.in);
		System.out.println(string);
		return scan.nextInt();
	}

	
}

