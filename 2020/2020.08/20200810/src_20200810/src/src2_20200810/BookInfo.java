package src2_20200810;

public class BookInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	
		Book [] book = new Book[10];
		int cnt = 0;
		
		book[cnt++] = new Magazine("���� ����Ʈ����", 200, "��ҿ�", "2020�� 5�� 31��");
		book[cnt++] = new Magazine("�ְ� IoT", 100, "�ּ���", "2020�� 6�� 23��");
		
		for(int i=0; i<cnt; i++) {
			book[i].BookInfo();
			System.out.println();
		}
	}

}
