package src1;

public class Answer_01 {
	public static void main(String [] args) {
		Melon m1 = new Melon(2500, 21, "Hallym_farm"); 
		//������ ȣ��
		//�ڽ� Ŭ������ �����ص� �θ� Ŭ������ �ִ� �� ���� �ڵ����� ������
		Melon m2 = new Melon(2000, 10, "Software_farm");
		//������ ȣ��22
		
		System.out.println("m1 ��ü ����["+ m1 +"]");
		System.out.println("m2 ��ü ����["+ m2 +"]\n");
		//toString() ȣ�� -> ��ü �̸��� ��� �ȴ�
		
		System.out.println(">>m2 ��ü�� cost�� ���۳�� ���� ���� ��");
		m2.setCost(3000); //m2�� �������� ������(�θ� Ŭ������ ����)
		m2.setInfo("JAVA_FARM");
		System.out.println(m2+"\n");
	}
}
