/*
 * ������ ���� ����ϴ� ���α׷�(������ ������ ����ڰ� �Է�)
 */
package src20190801;

//import java.util.*;
import java.util.*;

public class src3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random generator = new Random(); //������ �����ϴ� random ����
		
		int count = sc.nextInt(); //��ĳ�ʷ� ������ ������ �Ǵ� ���� �޾���
		int sum = 0; 
		
		for(int i=0; i<count; i++) {
			int number = generator.nextInt(100);//0���� 99 ���� ������ ���� ������ش�.
			sum += number;
		}
		System.out.println("����"+count+"���� ����"+sum);
	}

}
