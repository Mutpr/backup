package src3_20200912;

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
	
	private static void display(int[] seat) {
		// TODO Auto-generated method stub
		
	}
	
	private static boolean search(int[] seat, int i) {
		// TODO Auto-generated method stub
		for(int j = 0; j<=seat.length-1; j++) {
			System.out.print(seat+"\t");
	}return false;
	
	}
}
