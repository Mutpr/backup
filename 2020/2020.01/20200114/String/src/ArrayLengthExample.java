
public class ArrayLengthExample {
	public static void main(String args[]) { 
		/**
		 * �ڹ� Ŭ������ ���α׷��� �����ϸ� jvm�� ���̰� 0�� String �迭�� ���� ����
		 * ���� �޼ҵ带 ȣ���Ҥ� �Ű������� �����Ѵ�.
		 * 
		 */
		int [] scores = {83, 90, 87};
		int sum = 0;
		
		for(int i = 0; i<scores.length; i++) {
			sum+=scores[i];
		}
		
		System.out.println("����: "+ sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("���: "+avg);
	}

}
