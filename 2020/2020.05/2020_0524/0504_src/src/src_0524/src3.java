package src_0524;

public class src3 {
	// histogram() 메소드 – 매개변수로 받은 정수값 만큼 ‘*’출력, 
	//반환값은 없음
	public static void main(String[] args) {
	int[] cnt = {9, 4, 3, 6, 10, 2, 5};
	for(int v : cnt)
		histogram(v);
	}

	public static void histogram(int v) {
		int[] cnt = {9, 4, 3, 6, 10, 2, 5};
		int i;
		System.out.print(v+"]");
		for(i = 0; i<=v-1; i++) {
			System.out.print("*");
		}System.out.println();
		}
		
	}
