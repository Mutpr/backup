package src2_20200810;

public class BookInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	
		Book [] book = new Book[10];
		int cnt = 0;
		
		book[cnt++] = new Magazine("월간 소프트웨어", 200, "김소월", "2020년 5월 31일");
		book[cnt++] = new Magazine("주간 IoT", 100, "주소윤", "2020년 6월 23일");
		
		for(int i=0; i<cnt; i++) {
			book[i].BookInfo();
			System.out.println();
		}
	}

}
