package src2_20200803;

public class lector1 {
	
	public static void print() {
		int array1 [][] = {{2,3,4},{8,5,6}};
		
		for(int i=0; i<=array1.length-1; i++) {
			for(int j=0; j<array1[i].length; j++) {
				System.out.print(array1[i][j]);
				
			}
			System.out.println();
			System.out.println("=======");
		}
	}
	
	public static void main(String [] args) {
		print();
	}
	
}
