package src_20200608;

import java.util.*;
public class ServiceTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Service service = new Service();
		System.out.println("id 와 패스워드를 입력하세요.");
		service.id = scan.nextLine();
		service.pass = scan.nextInt();
		
		if(service.login(service.id,service.pass) == true) {
			System.out.println("로그인 되었습니다.");
			service.logout(service.id);
		}else {
			System.out.println("로그인 실패");
			System.out.println("아이디와 패스워드를 확인하세요.");
		}
	}

}
