package src2_20200912;

import java.util.*;
public class Answer_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 최대 값1 : " + max(4, 6, 5, 9, 23, 6));
		System.out.println("정수 최대 값2 : " + max(48, 24, 15, 36, 54, 89, 69, 82));
		System.out.println("실수 최대 값1 : " + max(4.5, 8.6, 12.3, 7.3, 2.4));
		System.out.println("실수 최대 값2 : " + max(12.6, 8.5, 46.5, 12.4, 6.41, 4.2, 9.5, 3.4));

	}
	
	static double max(double...doub) {
		double max = doub[0];
		for(int i =0; i<=doub.length-1; i++) {
			if(max < doub[i])
				max = doub[i];
		}
		return max;
	}
	}


