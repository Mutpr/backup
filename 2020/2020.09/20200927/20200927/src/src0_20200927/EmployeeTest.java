package src0_20200927;

import java.util.*;
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner scan = new Scanner(System.in);
	Person[] person=new Person[100];
	boolean flag=true;
	while (flag) {
		
		
		System.out.print("1: Salaried 객체 생성, 2: Hour 객체 생성 3. 종료 --> ");
		int menu = scan.nextInt();
		int cnt = 0;

		switch (menu) {
		case 1:
			System.out.println("이름, 사번, 급여를 입력하세요");
	            String na = scan.nextLine();
	            scan.nextLine();
	            int number = scan.nextInt();
	            int income = scan.nextInt();
			person[cnt++] = new SalariedEmployee(na, number, income);
			continue;
			
		case 2:
			System.out.println("이름, 사번, 시간당임금, 시간을 입력하세요");
				String na1 = scan.nextLine();
				scan.nextLine();
				int num1 = scan.nextInt();
				int income1 = scan.nextInt();
				int time = scan.nextInt();
			person[cnt++]= new HourEmployee(na1, num1, income1, time);
			continue;
			
		case 3:
			flag = false;
			for(int i = 0; i<cnt; i++) {
				System.out.println(person[i].toString());
			}break;
			
		default:
			System.out.println("잘못된 입력입니다");
			}
		    }
	}

}
