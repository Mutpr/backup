package src2_20200608;

public class person {
	private String name;
	private int year;
	
	public void setPerson(String name) {
		this.name =name;
	}
	public String getPerson() {
		System.out.println("�̸�:"+name);
		System.out.println("����⵵: "+year);
		return name;
	}
	
	public int getYear(int year) {
		this.year = year;
		return year;
	}
	
	void checkMask() {
		
		int week = year % 10;
		
		if(year>2020) {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		} else{
			if(week == 1 || week == 6) {
				System.out.println("��");
			}
			if(week == 2 || week == 7) {
				System.out.println("ȭ");
			}
			if(week == 3 || week == 8) {
				System.out.println("��");
			}
			if(week == 4 || week == 9) {
				System.out.println("��");
			}
			if(week == 5 || week == 0) {
				System.out.println("��");
			}
		}
		
	}
}
