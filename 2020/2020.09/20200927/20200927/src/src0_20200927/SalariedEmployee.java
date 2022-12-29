package src0_20200927;

class SalariedEmployee extends Person{
	protected int hourIncome; 
	
	@Override
	public int computeSalary() { //임금 계산
		//시간당 임금 * 일한 시간 반환
		hourIncome = hourIncome*12;
		return hourIncome;
	}
	
	public SalariedEmployee(String name, int emp, int hour) {
		super(name, emp);
		hourIncome = hour;
	}
	
	@Override
	public String toString() {
		super.toString();
		return "시간당 임금> "+hourIncome;
	}
	
	}

