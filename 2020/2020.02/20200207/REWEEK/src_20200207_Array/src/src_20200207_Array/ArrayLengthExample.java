package src_20200207_Array;

public class ArrayLengthExample {
	public static void main (String args[]) {
		int [] scores = {80, 90, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum+=scores[i]; 
			/*�迭�� ���̸�ŭ �ݺ��� sum�� �� ���� ���� ���� ���� ����
			 * for���� ���ǽĿ��� < �����ڸ� ����� ������ �迭�� ������ �ε����� 1�� ���� �����̴�
			*/
		}
		System.out.println("����: "+sum); //�� ���� ���� ���
		
		double avg = (double) sum / scores.length; //�� ���� ���� �迭 ���� ��ŭ ����
		System.out.println("���: "+avg); //��հ��� ���
	}
}
