package src1_20201105;

import java.util.*;
public class Answer_01 {
	public static void main(String[] args) {
		//charAt(int a)
		Scanner scan = new Scanner(System.in);
		String str = "자바 프로그램은 재미없습니다. 어렵습니다.";
		char ch= scan.next().charAt(0);
		for(int i=0; i<str.length(); i++) {
			if(ch == str.charAt(i)) {
				System.out.println(ch+"는"+(i+1)+"자리에 있습니다.");
				System.out.println("프로그램 종료");
				break;
			}else if(ch != str.charAt(i)){
				System.out.println(ch+"는 문자열에 없습니다");
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}
