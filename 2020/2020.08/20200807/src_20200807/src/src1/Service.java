package src1;

public class Service {
	String id;
	int pass;
	
	public static boolean login(String id, int pass) {
		if(id.equals("hallym") && pass==3456) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void logout(String id) {
		System.out.println(id+" �� �α׾ƿ� �Ǿ����ϴ�.");
		return;
	}
}
