package pack1_0716;

import java.util.*; 

public class src7 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); //스캐너 받아줌
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for(int i = 0; i<=a; i++) { //초기값을 0으로 지정해준다. 1로 지정하면 줄 하나 빠짐..
			for(int j = 0; j<=i; j++) //왜 j가 i보다 크면 안될까?
				System.out.print("*"); //*를 프린트 하고 나면
				System.out.println(""); //한줄 띄워준다.
		}
	}
}
