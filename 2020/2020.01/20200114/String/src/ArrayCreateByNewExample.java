public class ArrayCreateByNewExample {
	public static void main(String args[]) {
		int [] arr1 = new int[3]; //������ �迭 ����
		for(int i = 0; i<3; i++) {
			System.out.println("arr1["+ i +"] :" + arr1[i] ); //�迭�� ���� ������� �ʾұ� ������ �ʱⰪ ���
		}
		
		arr1[0] = 10; //�迭 0��° �ڸ��� ���ڸ� �־���
		arr1[1] = 20; //�迭 1��° �ڸ��� ���ڸ� �־���
		arr1[2] = 30; //�迭 2��° �ڸ��� ���ڸ� �־���
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]); //���ڸ� ������� �迭 arr1�� ���� 3�� �����
		}
		
		double[] arr2 = new double[3]; //�Ǽ��� �迭 ����
		for(int i = 0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]); //�迭�� ���� ������� �ʾұ� ������ �ʱⰪ�� ��µ�
		}
		arr2[0] = 0.1; //�迭 0��° �ڸ��� ���� �־���
		arr2[1] = 0.2; //�迭 1��° �ڸ��� ���� �־���
		arr2[2] = 0.3; //�迭 2��° �ڸ��� ���� �־���
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr2["+i+"] : " + arr2[i]); //���� ������� �Ǽ��� �迭 arr2�� ���� 3�� �����
		}
		
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"] : " + arr3[i]);
		}
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
	}

}
