package src_20191105;

public class src1 {
	public static void main(String args[]) {
		String strVar1 = "�Ź�ö"; //���� string ��ü�� strVar1 ���ڿ� ����
		String strVar2 = "�Ź�ö"; //���� string ��ü�� strVar2 ���ڿ� ����
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1 �� strVar2 �� ������ ����"); 
		} else {
			System.out.println("StrVar1�� strVar2�� ������ �ٸ�");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("StrVar1 �� strVar2�� ���ڿ��� ����");
		}
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3 �� strVar4�� ������ ����");
		} else {
			System.out.println("strVar3 �� strVar4�� ������ �ٸ�");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3 �� strVar4�� ���ڿ��� ����");
		}
	}

}
