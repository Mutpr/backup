/*
 * 두개의 주사위를 던졌을 때 나오는 눈을 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
 * 눈의 합이 5이면 실행을 멈추는 코드 작성
 */
package src_20190802;

import java.util.*;

public class prac0802_2 {
	public static void main(String args[]) {
		
		while(true){ //일단 실행된다
			
			int num1 = //초기화후
					(int)(Math.random()*6)+1; //형변환 //math.random으로 난수를 해준다.
			int num2 = //초기화 후
					(int)(Math.random()*6)+1; //형변환 //math.random으로 난수 표현을 해준다.
			
			if(num1+num2==5) { //num1과 num2를 더해서 5이면 
				System.out.print("("+num1+","+num2+")"); //값을 출력하고
				break;//반복문을 빠져나간다
			}else{ //5가 아니라면 아니라면
				System.out.print("("+num1+","+num2+")"); //계속 반복한다.
				}
		}
		}
	}
