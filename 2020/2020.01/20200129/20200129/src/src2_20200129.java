import java.util.*;
public class src2_20200129 {
	public static void main(String args[]) {
		week Today = null;
		
		Calendar CAL = Calendar.getInstance();
		int Week = CAL.get(Calendar.DAY_OF_WEEK);
		
		switch(Week) {
		case 1:
			Today = week.SUNDAY;
			break;
		case 2:
			Today = week.TUESDAY;
			break;
		case 3:
			Today = week.WEDNESDAY;
			break;
		case 4:
			Today = week.THURSDAY;
			break;
		case 5:
			Today = week.FRIDAY;
			break;
		case 6:
			Today = week.SATURDAY;
			break;
		case 7:
			Today = week.SUNDAY;
			break;
			
		}
		
		System.out.println("오늘 요일:" + Today);
		
		if(Today == week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부 합니다.");
		}
	}
}
