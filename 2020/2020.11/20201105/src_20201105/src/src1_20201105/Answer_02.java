package src1_20201105;

import java.util.*;
public class Answer_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [] word = {"������", "����","�β���"};
		double index = (int)(Math.random()*word.length);
		String start = word[(int)index];
		int leng = word[(int)index].length()-1;
		char ch = start.charAt(leng);
		boolean do_while = false;
		String myWord;
		char Wordch, WordStart = 0;
		
			System.out.println("���� �ܾ�:"+ start);
			System.out.println(ch+"���� �����ϴ� �ܾ �Է��ϼ���.");
			myWord = scan.nextLine();
			int WordLeng = myWord.length()-1;
			Wordch = myWord.charAt(WordLeng);
			WordStart = myWord.charAt(0);
			
			if(ch == WordStart) {
				do {
					System.out.println("���� �ܾ�:"+ Wordch);
					System.out.println(Wordch+"���� �����ϴ� �ܾ �Է��ϼ���.");
					
					String myWord1 = scan.nextLine();
					int WordLeng1 = myWord.length()-1;
					char Wordch1 = myWord.charAt(WordLeng);
					char WordStart1 = myWord.charAt(0);
					
					if(Wordch == WordStart1) {
						System.out.println(Wordch1+"�� �����ϴ� �ܾ �Է��ϼ���.");
						continue;
					}else if(Wordch != WordStart1) {
						System.out.println("Ʋ�Ƚ��ϴ�.");
						System.out.println("�����մϴ�.");
						break;
					}else if(myWord1 == "finish") {
						System.out.println("�����մϴ�..");
						break;
					}
				}while(true);
				
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			
				
}
}
