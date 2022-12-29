package src_0524;

public class lector5 {
	public static void init_array(int[]dim) {
		for(int i =0; i<dim.length; i++) {
			dim[i] = (int)(Math.random())*50+1;
		}
	}
	
	public static void write(int [] dim, String message) {
		System.out.println("======"+message+"======");
		for(int value:dim)
			System.out.print(value+" ");
		System.out.println();
	}
	
	public static void main(String []args) {
		int [] arr1 = new int[7];
		System.out.println("배열을 초기화합니다.");
		init_array(arr1);
		System.out.println("배열 원소를 출력합니다.");
		write(arr1, "배열: arr1");
	}
}
