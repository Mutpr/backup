package src_0516;

import java.util.*;
public class src6 {
	public static void main(String[] args) {
		  final int SIZE = 10;
		  int i, s;
		  int seats[] = new int[SIZE];
		  int cnt=0;
		  
		  while (true) {
		   System.out.println("====================");
		   
		   for(i=0; i<SIZE; i++)
		    System.out.printf("%d ", i+1);
		   
		   System.out.println("\n====================");
		   
		   for(i=0; i<SIZE; i++)
		    System.out.printf("%d ", seats[i]);
		   
		   System.out.println("\n====================");
		   System.out.print("���Ͻô� �¼���ȣ�� �Է��ϼ��� (����� -1, �ڸ��� ������ �ڵ� ����): ");
		   Scanner sc = new Scanner(System.in);
		   s = sc.nextInt();
		   
		   if (s == -1)
		    break;
		   
		   if (seats[s-1] == 0) {
		    seats[s-1] = 1;
		    System.out.println("����Ǿ����ϴ�.");
		   }
		   else
		    System.out.println("�̹� ����� �ڸ��Դϴ�.");
		   
		   for (i=0; i<SIZE; i++)
		    cnt += seats[i];
		   
		   if (cnt == SIZE)
		    break;
		   
		   cnt = 0;
		    
		  }
		  
		 }

		
	}


