package src0_20201012;

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle taxi = new Vehicle() {
			public void run(int num) {
				System.out.println(num+ "���� �ýð� �޸��ϴ�.");
				power();
				}
			public void power() {
				System.out.println("�ýô� LPG�� ����մϴ�.");
			}	
		};
		
		Vehicle bus = num ->{
			System.out.println(num+" ���� ������ �޸��ϴ�.");
		};
		
		Person java = new Person("Hallym") {
			void time(int t) {
				System.out.println("��ٽð��� "+t+"�� �Դϴ�.");
			}
			void work() {
				System.out.println(dept+"���� �ٹ��մϴ�."); 
				time(13);
			}
		};
		
		bus.run(3);
		taxi.run(5);
		java.work();
		
	}

}
