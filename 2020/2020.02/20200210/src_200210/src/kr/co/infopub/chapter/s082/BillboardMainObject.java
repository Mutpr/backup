package kr.co.infopub.chapter.s082;

public class BillboardMainObject {
	public static void main(String args[]) {
		Billboard b1 = new Billboard(1, "Despacito", 1, "http://www.naver.com","luis fonsi");
		Billboard b2 = new Billboard(2, "That's What I like", 2, "http://www.naver.com", "Bruno Mars");
		Billboard b3 = new Billboard(3, "I'm the One", 3,"http://www.naver.com","dj khaled");
		BillboardMain2 BM2 = new BillboardMain2();
		
	}
	
	public static void showAbout(Billboard bb) {
		System.out.println("1----");
		String sf = String.format("%d, %s, %d, %s, %s", bb.getRank(),bb.getSong(),bb.getLastWeek(),bb.getImagesrc(),bb.getArtist());
		System.out.println(sf);
	}
	
	public static void showAbout(Billboard [] b) {
		System.out.println("2----");
		for(Billboard bill:b) {
			showAbout(bill);
		}
		System.out.println("==========2==========");
	}

}
