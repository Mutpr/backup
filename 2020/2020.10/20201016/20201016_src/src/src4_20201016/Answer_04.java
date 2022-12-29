package src4_20201016;

public class Answer_04 {

	public static void main(String[] args) {
		String[] title= {"자바", "파이썬", "코딩", "자바스크립트","자료구조"};
		int[] pages= {180, 150, 200, 220, 221};
		int max_page=max_index(pages);
		System.out.println("최대 페이지 수 : " + pages[max_page]);
		System.out.println("최대 페이지수를 가진 책 : " + title[max_page]);

	}
	
	public static int max_index(int[] arr) {
		int max_index = arr[0];
		for(int i =0; i<=arr.length-1; i++) {
			if(max_index < arr[i])
				max_index = arr[i];
		}
		return max_index;

	}

}
