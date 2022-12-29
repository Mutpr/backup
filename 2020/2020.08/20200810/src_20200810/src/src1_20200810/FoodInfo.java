package src1_20200810;

import java.util.*;
public class FoodInfo {
	public static void main(String[] args) {
		Food [] m = new Food[10];
		int cnt = 0;
		
		m[cnt++] = new Melon(2500, 21, "hallym");
		m[cnt++] = new Melon(2000, 10, "software");
		
		for(int i=0; i<cnt; i++) {
			m[i].ShowInfo();
			System.out.println();
		}
	}

}
