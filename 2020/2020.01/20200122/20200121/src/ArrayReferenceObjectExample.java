public class ArrayReferenceObjectExample {
	public static void main(String[]args) {
		String [] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		//strArray[0]�� strArray[1]�� ���� �ּҰ��� ������ ����
		strArray[2] = new String("java");
		//strArray[2]�� strArray[0]�� strArray[1]���� �ٸ� �ּҰ��� ����
		
		System.out.println(strArray[0] == strArray[1]); //strArray[0]�� strArray[1]�� ���� �ּҰ��� ��������?
		System.out.println(strArray[0]==strArray[2]); //strArray[0]�� strArray[2]�� ���� �ּҰ��� ��������?
		System.out.println(strArray[0].equals(strArray[2]));//strArray[0]�� strArray[2]�� ���� ������ ������ �ֳ���?
	}
}
