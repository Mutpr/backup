package src_0524;

public class src1 {
	
	public static void main(String [] args) {
		int[] isource= {21, 34, 76, 38, 11, 8, 56, 98, 64};    
				int m=max(isource);
				System.out.println("MAX = " +m);
	}

	public static int max(int[] isource) {
		// TODO Auto-generated method stub
		
		int max = -1;
		int min = 100;
		int MaxIndex = 0;
		int MinIndex = 0;
		
		for(int i=0; i<=isource.length-1; i++) {
			
				if(isource[i]>max) {
					max = isource[i];
					MaxIndex = i+1;
				}
			}
			for(int k = 0; k<isource.length; k++) {
				System.out.print(isource[k]+"\t");
			}
			return max;
			
	}
}
