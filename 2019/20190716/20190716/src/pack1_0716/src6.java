/*
 * 사용자로부터 높이와 넓이를 입력받아 중첩된 반복문을 이용해서 다음의 패턴을 출력하시오.
 */
package pack1_0716;

import java.util.*;

public class src6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		//사각형
		for(int i=1; i<=a; i++) { //i는 a보다 같거나 작을때까지 반복한다.
			for(int j=1; j<=b; j++) //j는 b보다 같거나 작을때까지 반복한다.
			System.out.print("*"); //*를 a만큼 한줄 찍고
			System.out.println();//한줄띄우기를 b만큼 반복한다.
		}
		
		
	}
}
