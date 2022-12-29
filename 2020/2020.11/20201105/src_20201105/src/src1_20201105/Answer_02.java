package src1_20201105;

import java.util.*;
public class Answer_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [] word = {"개구리", "생강","두꺼비"};
		double index = (int)(Math.random()*word.length);
		String start = word[(int)index];
		int leng = word[(int)index].length()-1;
		char ch = start.charAt(leng);
		boolean do_while = false;
		String myWord;
		char Wordch, WordStart = 0;
		
			System.out.println("시작 단어:"+ start);
			System.out.println(ch+"으로 시작하는 단어를 입력하세요.");
			myWord = scan.nextLine();
			int WordLeng = myWord.length()-1;
			Wordch = myWord.charAt(WordLeng);
			WordStart = myWord.charAt(0);
			
			if(ch == WordStart) {
				do {
					System.out.println("시작 단어:"+ Wordch);
					System.out.println(Wordch+"으로 시작하는 단어를 입력하세요.");
					
					String myWord1 = scan.nextLine();
					int WordLeng1 = myWord.length()-1;
					char Wordch1 = myWord.charAt(WordLeng);
					char WordStart1 = myWord.charAt(0);
					
					if(Wordch == WordStart1) {
						System.out.println(Wordch1+"로 시작하는 단어를 입력하세요.");
						continue;
					}else if(Wordch != WordStart1) {
						System.out.println("틀렸습니다.");
						System.out.println("종료합니다.");
						break;
					}else if(myWord1 == "finish") {
						System.out.println("종료합니다..");
						break;
					}
				}while(true);
				
			}else {
				System.out.println("틀렸습니다.");
			}
			
				
}
}
