package src2;

public class Person {
	
	private String name;
	private int year = 1998;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	
	void checkMask() {
		int week = year % 10;
		if(year>2020) {
			System.out.println("잘못 입력 하셨습니다. ");
		}else {
			if(week == 1 || week == 5) {
				System.out.println("\t"+"Mask: 월");
			}
			
			if(week == 2 || week == 6) {
				System.out.println("\t"+"Mask: 화");
			}
			
			if(week == 3 || week == 7) {
				System.out.println("\t"+"Mask: 수");
			}
			
			if(week == 4 || week == 8) {
				System.out.println("\t"+"Mask: 목");
			}
			
			if(week == 5 || week == 9) {
				System.out.println("\t"+"Mask: 금");
			}
		}
	}
	
}
