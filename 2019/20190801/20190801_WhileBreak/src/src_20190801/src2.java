/*
 * 최대공약수 찾기
 * 1) 두 수 가운데 큰 수를 x, 작은 수를 y라 한다.
 * 2) y가 0이면 공약수는 x와 같다
 * 3) r <- x%y
 * 4) x <- y
 * 5) y <- r
 * 6) 단계 2로 되돌아감.
 */
package src_20190801;

import java.util.*;

public class src2 {
	public static void main(String args[]) {//메인 메소드
		Scanner sc = new Scanner(System.in); // 스캐너 객체
		int a,b,tmp;
		//int uc;
		System.out.println("두 정수를 입력하시오:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		do{
			if(a<b) {
				tmp = b;	//num2(큰 값)를 temp에,
				a = b;	//num1(작은 수)를 num2에,
				a = tmp;	//결과적으로 temp(큰 수)를 num1에 저장
			}
		} while(b!=0);{
				System.out.println(a);					//num1>num2이면 그냥 바로 아래 명령을 실행
			
			
			}
	}
}
