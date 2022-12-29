package src_20200203;

public class CaarrrExample {
	public static void main(String args[]) {
		Caarrr car1 = new Caarrr();
		System.out.println("car1.Company: "+car1.company);
		System.out.println();
		
		Caarrr car2 = new Caarrr("자가용");
		System.out.println("car2.Company: "+car2.company);
		System.out.println("car2.model: "+car2.model);
		System.out.println();
		
		Caarrr car3 = new Caarrr("자가용", "빨강");
		System.out.println("car2.Company: "+car3.company);
		System.out.println("car2.model: "+car3.model);
		System.out.println("car2.color: "+car3.color);
		System.out.println();
		
		Caarrr car4 = new Caarrr("택시", "검정", 200);
		System.out.println("car2.Company: "+car4.company);
		System.out.println("car2.model: "+car4.model);
		System.out.println("car2.color: "+car4.color);
		System.out.println("car2.maxSpeed: "+car4.maxSpeed);
	}

}
