package src_20200813;

import java.util.*;
public class ArrayExample_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array1 [] = new int [10];
		int array2[] = new int[10];
		int cnt=0;
		
		for(int i = 0; i<array1.length; i++) {
			//cnt = 0;
			array1[i] = scan.nextInt();
			array2[i] = array1[i] % 42;
		}
		for(int i = 0; i<array2.length; i++) {
			for(int j=0; j<i; j++) {
				if(array2[i]==array2[j]) {
					cnt--;
					break;
			}
			}
				cnt++;
		}
		System.out.println(cnt);
		
	}

}
