package src_0505;

/*

����
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. 
(0 < A, B < 10)
�Է��� ���������� 0 �� ���� ���´�.

���
�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
 */
import java.util.*;

public class src2 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		int A,B;
		
		while(true) {
			
			A = scan.nextInt();
			B = scan.nextInt();
			
			if(A == 0 && B == 0) {
				break;
			}
			System.out.println((A+B));
		}
	}
}
