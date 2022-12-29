/*
 * 숫자 추측 게임:3
 */
package src_20190804;

import java.util.*;
public class src1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); //스캐너 객체 불러옴
		
		int guess;//입력할 숫자
		int answer = 67; //정답, answer도 입력하는 숫자로 할 수 있갯다
		int tries = 0; // 추측한 횟수를 내놓기 위한 변수 tries
		
		do {
			System.out.println("정답을 추측하여 보시오:");
			guess = sc.nextInt();
			tries++; //do-while이 돌아간 횟수를 표현한다.(무조건 한번은 돌기 때문에 1부터 시작) 
			
			if(guess > answer) { //입력한 숫자가 정답보다 크다면
				System.out.println("추측한 숫자가 정답보다 큽니다.");
			}
			if(guess < answer) { //입력한 숫자가 정답보다 작다면
				System.out.println("추측한 숫자가 정답보다 작습니다.");
			}
			
		} while(!(answer==guess)); //입력한 숫자와 정답이 같다면 false로 바꾸어 do-while문을 빠져나간다.
		System.out.println("축하합니다! 정답입니다. ♥");
		System.out.println("시도한 횟수: " + tries);
		
	}

}
