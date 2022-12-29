package pack_0716;

public class src2 {
	public static void main(String args[]) {
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i; 
			i++;
		}System.out.println(sum); //증가값의 총합을 표현하고 싶으면 while 문 밖으로 내보내야함.
	}

}
