package src3_20200912;

import java.util.*;
public class Answer_03 {

	public static void main(String[] args) {
		int[] seat = { 0, 0, 1, 0, 1, 1, 0, 0, 1, 0 }; // 1:����� �¼�, 0:���డ���� �¼�
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("�¼� ��ȣ�� �Է��ϼ���(����� 0) >> ");
			int number = in.nextInt();
			if(number <= 0)
				break;
			if (search(seat, number - 1))  
				System.out.println("���� �Ϸ�");
			else
				System.out.println("���� �Ұ� : ����� �¼�");

			System.out.println("---------- ���� ��Ȳ -----------");
			display(seat);
		}
	}
	
	private static void display(int[] seat) {
		// TODO Auto-generated method stub
		
	}
	
	private static boolean search(int[] seat, int i) {
		// TODO Auto-generated method stub
		for(int j = 0; j<=seat.length-1; j++) {
			System.out.print(seat+"\t");
	}return false;
	
	}
}
