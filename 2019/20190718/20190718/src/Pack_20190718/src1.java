package Pack_20190718;

import java.util.*;

public class src1 {
	public static void main(String args[]) {
		
		//src1_2 src = new src1_2();
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int sum=0;
		String inputString;
		
		do { 
			System.out.println("명령어를 입력해주세요."); 
			System.out.println("p: 합산프로그램");
			System.out.println("q: 프로그램 종료");
			inputString = sc.nextLine();
			//System.out.println(inputString);
			
			if(inputString.equals("p")) { //키보드로 받은게 p가 맞다면 if를 실행한다.
				System.out.println("시작숫자를 입력하시오:");
				a = sc.nextInt(); //a를 키보드로 받는다.
				System.out.println("종료숫자를 입력하시오:");
				b = sc.nextInt(); //b를 키보드로 받는다.
				
				for(; a<=b; a++) { //a부터 b까지를 합산하는 반복문.
					sum += a;	//sum에 a의 값을 집어 넣는다.
				} System.out.println(sum); 
				
			} break;//do-while 반복문에서 빠져나온다.
		
				
		} while(!inputString.equals("q")); {
			//System.out.println();
			System.out.println("프로그램을 종료합니다."); //do-while 구문이라 while이 무조건 한번 실행된다.

		}
			
			
	 }
}	
