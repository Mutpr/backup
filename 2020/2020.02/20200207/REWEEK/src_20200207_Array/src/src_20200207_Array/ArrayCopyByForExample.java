package src_20200207_Array;

public class ArrayCopyByForExample {
	public static void main (String args[]) {
		int [] oldIntArray = {1,2,3};
		int [] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; //newIntArray�� ���� oldIntArray�� ���� �־���
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i]+","); //newIntArray�� ���� �������
			//����Ǵ� �׸�� �����ϴ� �׸��� ���� ���� ������ ��ŭ �� �迭�� �ʱⰪ���� ä����
		}
	}

}
