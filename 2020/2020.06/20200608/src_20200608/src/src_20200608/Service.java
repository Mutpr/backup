package src_20200608;

public class Service {
	String id;
	int pass;
	
	public static boolean login (String id, int pass) {
	//매개변수 id 값이 hallym, pass가 3456일 경우에만 true로 리턴하고
	//그 외의 값은 false를 리턴하는 정적 멤버로 할 것
		if(id.equals("hallym") && pass == 3456 ) {
			return true;
			
		}else {
			return false;
		}	
		}
	
	public static void logout(String id) {
		System.out.println(id+" 님 로그아웃 되었습니다.");
		return;
	}
}
