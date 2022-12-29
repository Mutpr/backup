
import java.util.*;
public class Answer_04 {
	public static void main(String[] args) {
		
		String[] title= {"자바", "파이썬", "코딩", "자바스크립트","자료구조"};
		int[] pages= {150, 100, 120, 200, 180};
		int max_page=max_index(pages);
		
		System.out.println("최대 페이지 수 : " + pages[max_page]);
		System.out.println("최대 페이지수를 가진 책 : " + title[max_page]);
	}

	static int max_index(int...max) {
		int max_index = max[0];
		for(int i =0; i<=max.length-1; i++) {
			if(max_index < max[i])
				max_index = max[i];
		}
		return max_index;
	}

}
