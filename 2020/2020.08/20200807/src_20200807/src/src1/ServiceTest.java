package src1;

import java.util.*;
public class ServiceTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Service service = new Service();
		
		System.out.println("���̵� �Է����ּ���>> ");
		service.id = scan.nextLine();
		System.out.println("��й�ȣ�� �Է����ּ���>> ");
		service.pass = scan.nextInt();
		
		if(service.login(service.id, service.pass)==true) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			service.logout(service.id);
		}else {
			System.out.println("�α��ο� �����߽��ϴ�.");
			System.out.println("���̵�� �н����带 �Է����ּ���.");
		}
	}

}
