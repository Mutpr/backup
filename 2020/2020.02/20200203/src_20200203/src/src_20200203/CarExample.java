package src_20200203;

public class CarExample {
	public static void main (String args[]) {
		Car myCar = new Car();
		
		System.out.println("����ȸ��: "+ myCar.company);
		System.out.println("�𵨸�: "+myCar.model);
		System.out.println("����: "+myCar.model);
		System.out.println("�ְ�ӵ�: "+myCar.maxSpeed);
		System.out.println("����ӵ�: "+myCar.Speed);
		
		myCar.Speed = 60;
		System.out.println("������ �ӵ�: "+myCar.Speed);
	}
}


