package src0_20200927;

class HourEmployee extends Person{
	protected int income;
	protected int workHour;
	int totalIncome;
	
	@Override
	public int computeSalary() { //임금 계산
		//시간당 임금 * 일한 시간 반
		totalIncome = income*workHour;
		return totalIncome;
	}
	
	public HourEmployee(String name, int emp, int in, int work) {
		super(name, emp);
		// TODO Auto-generated constructor stub
		income = in;
		workHour = work; 
	}
	
	@Override
	public String toString() {
		super.toString();
		return "일한 시간> "+workHour
				+"시간당 임금> "+income 
				+"총 임금> "+totalIncome;
	}
}
