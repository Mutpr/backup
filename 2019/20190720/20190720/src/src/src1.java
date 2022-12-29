package src;

import java.util.*;
public class src1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		//int b = sc.nextInt();
		
		for(int i=0; i<=a; i++) { //별이 출력된 위치(줄로 입력해 준 a만큼만 반복)
			for(int j=0; j<=i; j++) { //별이 출력된 줄 (i 만큼만 반복)
				System.out.print("*"); //*을 출력해줌
			}
			System.out.println(); //한줄을 띄워줌
		}
			
		
	}

}
