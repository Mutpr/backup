package src_0516;

import java.util.*;
public class src5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menu;
		int select;
		boolean [] seat = new boolean[10];
		
		while(true) {
			System.out.println("1) 대여 2) 대여현황 3) 종료");
			menu = scan.nextInt();
			switch(menu) {
			case 1:{
				System.out.println("대여할 좌석을 선택해주세요.");
				select = scan.nextInt();
				for(int i =0; i<=seat.length-1; i++) {
					if(i==select) {
						seat[i] = true;
						break;
					}if(seat[i] == true) {
						System.out.println("대여 된 좌석");
						break;
					}
			}
				}
			case 2:{
				for(int i=0; i<=seat.length-1; i++) {
					System.out.print(i+")"+seat[i]+"\t");
					continue;
				}
			}
			case 3:{
				System.out.println("종료합니다");
				break;
			}
				
			}
		}
		
	}

}
