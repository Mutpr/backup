import java.util.*; 
public class src1_20200129 {
	public static void main(String arg[]) {
		
		week week1 = week.SUNDAY;
		week week2 = week.SUNDAY;
		System.out.println(week1 == week2);
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		//today == week.SUNDAY;
	}

}
