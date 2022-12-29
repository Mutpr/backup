package src1_20200912;

import java.util.*;
public class Answer_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		  int[] data = new int[10]; //int 배열 선언 & 생성

		  	init(data); //난수로 배열 초기화
		  
		  System.out.println("------- 초기화 된 배열 출력 -----------");
		  	for(int temp:data) {
		  		System.out.print(temp + "\t");
		  		System.out.println();
		  	   }	
		  System.out.println("------- 역순으로 출력 -----------");
		  	reverse(data);
		  	}

	

	private static void init(int[] arg) {
		// TODO Auto-generated method stub
		//int [] arg = new int [10];
		for(int i = 0; i<arg.length; i++) {
			arg[i] = (int) (Math.random()*100);
		}
	}
	
	private static void reverse(int[] arg) {
		for(int j = arg.length-1; j>=0; j--) {
			System.out.println(arg[j]);
			
		}
	}
	}

