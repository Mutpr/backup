
public class src3_20200129 {
	public static void main(String args[]) {
		//name �޼ҵ�
		
		week today = week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal()�޼ҵ�
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compare to()
		week day1 = week.MONDAY;
		week day2 = week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf()
		
		if(args.length == 1) {
			String strDay = args[0];
			week weekDay = week.valueOf(strDay);
			if(weekDay == week.SATURDAY || weekDay == week.SUNDAY) {
				System.out.println("�ָ��̱���");
			} else {
				System.out.println("���� �̱���");
			}
		}
		
		//value()
		
		week[] days = week.values();
		for(week day : days) {
			System.out.println(day);
		}

	}

}
