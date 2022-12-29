package src2;

public class BookTest {
	public static void main(String [] args) {
		Magazine bookA = new Magazine("신1","280","베르나르 베르베르","");
		Magazine bookB = new Magazine("비둘기", "104","파트리크 쥐스킨트","");
		
		bookA.setInfo("발매정보: 2020년 3월");
		bookB.setInfo("발매정보: 2000년 3월");
		
		System.out.println(bookA);
		System.out.println(bookB);
		
	}
}
