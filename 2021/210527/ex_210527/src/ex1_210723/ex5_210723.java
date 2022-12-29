package ex1_210723;

public class ex5_210723 {
/*2차원 배열의 합과 평균*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] Array = {{1,2,3,4},{5,6,7,8}};
		double Aver = 0;
		double Aver1 = 0;
		for(int i=0; i<Array.length; i++) {
			for(int j=0; j<Array[i].length; j++) {
				Aver+=Array[i][j];
				Aver1++;
			}
		}
		
		System.out.println(Aver/Aver1);
		System.out.println(Aver);
	}

}
