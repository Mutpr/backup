package src;

import java.util.*;
public class src1_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) { // 줄의 갯수 만큼 실행되야 하므로 i<a를 사용해준다.
			//i<a인 이유는 a와 같을때까지 반복되면 높이보다 한번 더 실행되서!
			for(int j=a-1; j>i; j--) { //공백의 갯수(별과 다르게 하나씩 줄어야 해서 --식)
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) { //별의 갯수
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
