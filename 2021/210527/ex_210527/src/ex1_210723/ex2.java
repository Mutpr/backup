package ex1_210723;
import java.util.*;

public class ex2 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int [] ScanArray = new int[10];
		int [] backUpArray = new int[10];
		for(int i=0; i<10; i++) {
			ScanArray[i] = scan.nextInt();
			if(ScanArray[i]%3 == 0) {
				backUpArray[i]=ScanArray[i];
			}
		}System.out.println(backUpArray);
	}
}
