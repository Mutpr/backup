package src1;

import java.util.*;
public class ServiceTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Service service = new Service();
		
		System.out.println("아이디를 입력해주세요>> ");
		service.id = scan.nextLine();
		System.out.println("비밀번호를 입력해주세요>> ");
		service.pass = scan.nextInt();
		
		if(service.login(service.id, service.pass)==true) {
			System.out.println("로그인 되었습니다.");
			service.logout(service.id);
		}else {
			System.out.println("로그인에 실패했습니다.");
			System.out.println("아이디와 패스워드를 입력해주세요.");
		}
	}

}
