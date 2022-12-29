package ex1_210723;

public class ex4_210723 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] Average = {1,2,3,4,5,6};
		double Aver = 0;
		for(int i = 0; i<Average.length; i++) {
			Aver += Average[i];
		}System.out.println(Aver/Average.length);
		System.out.println(Aver);
	}

}
