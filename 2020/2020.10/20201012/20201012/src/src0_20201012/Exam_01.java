package src0_20201012;

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle taxi = new Vehicle() {
			public void run(int num) {
				System.out.println(num+ "대의 택시가 달립니다.");
				power();
				}
			public void power() {
				System.out.println("택시는 LPG를 사용합니다.");
			}	
		};
		
		Vehicle bus = num ->{
			System.out.println(num+" 대의 버스가 달립니다.");
		};
		
		Person java = new Person("Hallym") {
			void time(int t) {
				System.out.println("출근시간은 "+t+"시 입니다.");
			}
			void work() {
				System.out.println(dept+"에서 근무합니다."); 
				time(13);
			}
		};
		
		bus.run(3);
		taxi.run(5);
		java.work();
		
	}

}
