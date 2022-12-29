package ex1_210723;

public class ex3_210723 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {1,0,4,3,7,9,10};
		int max = 0;
		
		for(int i=0; i<num.length; i++) {
			if(i == 6) {
				break;
			} else if(num[i]<num[i+1]) {
				max=num[i+1];
			}
		}System.out.println(max);
	}

}
