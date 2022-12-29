package src3_20201016;

import java.util.*;
public class Answer_03 {

	public static void main(String[] args) {
		int[] seat = { 0, 0, 1, 0, 1, 1, 0, 0, 1, 0 }; // 1:예약된 좌석, 0:예약가능한 좌석
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("좌석 번호를 입력하세요(종료는 0) >> ");
			int number = in.nextInt();
			if(number <= 0)
				break;
			if (search(seat, number - 1))  
				System.out.println("예약 완료");
			else
				System.out.println("예약 불가 : 예약된 좌석");

			System.out.println("---------- 예약 현황 -----------");
			display(seat);

	}

}

	private static boolean search(int[] arr, int a) {
		return true;
	}
	
	private static void display(int [] arr) {
		
	}
}
