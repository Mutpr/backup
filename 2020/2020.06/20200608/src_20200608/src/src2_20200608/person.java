package src2_20200608;

public class person {
	private String name;
	private int year;
	
	public void setPerson(String name) {
		this.name =name;
	}
	public String getPerson() {
		System.out.println("이름:"+name);
		System.out.println("출생년도: "+year);
		return name;
	}
	
	public int getYear(int year) {
		this.year = year;
		return year;
	}
	
	void checkMask() {
		
		int week = year % 10;
		
		if(year>2020) {
			System.out.println("잘못 입력 하셨습니다.");
		} else{
			if(week == 1 || week == 6) {
				System.out.println("월");
			}
			if(week == 2 || week == 7) {
				System.out.println("화");
			}
			if(week == 3 || week == 8) {
				System.out.println("수");
			}
			if(week == 4 || week == 9) {
				System.out.println("목");
			}
			if(week == 5 || week == 0) {
				System.out.println("금");
			}
		}
		
	}
}
