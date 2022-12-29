/*
 * 난수의 합을 계산하는 프로그램(난수의 개수는 사용자가 입력)
 */
package src20190801;

//import java.util.*;
import java.util.*;

public class src3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random generator = new Random(); //난수를 생성하는 random 변수
		
		int count = sc.nextInt(); //스캐너로 난수의 갯수가 되는 변수 받아줌
		int sum = 0; 
		
		for(int i=0; i<count; i++) {
			int number = generator.nextInt(100);//0부터 99 사이 난수의 합을 계산해준다.
			sum += number;
		}
		System.out.println("난수"+count+"개의 합은"+sum);
	}

}
