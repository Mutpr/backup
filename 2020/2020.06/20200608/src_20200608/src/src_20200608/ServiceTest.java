package src_20200608;

import java.util.*;
public class ServiceTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Service service = new Service();
		System.out.println("id �� �н����带 �Է��ϼ���.");
		service.id = scan.nextLine();
		service.pass = scan.nextInt();
		
		if(service.login(service.id,service.pass) == true) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			service.logout(service.id);
		}else {
			System.out.println("�α��� ����");
			System.out.println("���̵�� �н����带 Ȯ���ϼ���.");
		}
	}

}
