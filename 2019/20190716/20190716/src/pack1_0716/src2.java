/*
 * 실습 1의 프로그램을 while 문을 이용해서 출력.
 * ㅋㅋ ㅋ ㅋ ㅋ ㅋ ㅋ ㅋfor문을 이용해서 받아버린거임~
 */
package pack1_0716;

import java.util.*;
public class src2 { 
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); //Scanner 받아줌.
		
		int a;
		a = scan.nextInt(); //A를 키보드로 입력받음.
		int i=1;
		
//		for (int i = 1; i<=a; i++) { //증감식을 이용해서 i가 a보다 같거나 작은 만큼 증가하도록 함.
//			System.out.println("["+i+"]"); // for문은 for(초기화식->조건식-> 증감식->실행문)
//		}
		
		while(i<=a) {
			System.out.println("["+i+"]"); //while은 초기화식-> while(조건식)->증감식  순으로 만들어짐.
			i++; 
			//필요에 따라 증감식과 실행식의 순서는 변할 수 있다! 증감식이 먼저 오면 +나 -가 된 다음 실행되므로 플러스나 마이너스가 되어있는 상태가 된다.
		}
		
	}

}
