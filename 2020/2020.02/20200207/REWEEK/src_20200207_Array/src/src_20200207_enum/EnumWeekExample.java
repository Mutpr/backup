package src_20200207_enum;
import java.util.*;

public class EnumWeekExample {
	public static void main(String args[]) {
		week today = null; // 열거타입 변수 선언
		
		Calendar cal = Calendar.getInstance(); 
		int Week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(Week) {
		case 1:
			today = week.sunday; //열거 상수 대입
			break;
		case 2:
			today = week.monday;
			break;
		case 3:
			today = week.tuesday;
			break;
		case 4:
			today = week.wednesday;
			break;
		case 5:
			today = week.thursday;
			break;
		case 6:
			today = week.friday;
			break;
		case 7:
			today = week.saturday;
			break;
		}
		
	}
}
