/*
 * 월을 입력받는 프로그램
 */
package src_20190801;

import java.util.*;
public class src1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int month ;
		
		do {
			System.out.println("올바른 월을 입력하시오. [1-12]");
			month = sc.nextInt();
			
		}while(month<1 ||month>12); {
			//do-while할때 while 조건문 뒤에 ; 빼먹지 말기
		} System.out.println("사용자가 입력한 월은 " + month); //월을 벗어나지 않으면 false 되서 빠져나감
	} 
	

}
