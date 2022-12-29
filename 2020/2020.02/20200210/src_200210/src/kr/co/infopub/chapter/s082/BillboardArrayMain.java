package kr.co.infopub.chapter.s082;

import java.util.ArrayList;

public class BillboardArrayMain {
	public static void main(String args[]) {
		ArrayList<Billboard> bills = new ArrayList<>();
		bills.add(new Billboard(1, "despacito", 1, "http://www.naver.com", "luis fondi"));
		bills.add(new Billboard(2, "thas's what i like", 2, "http://www.naver.com", "bruno mars"));
		bills.add(new Billboard(3, "i'm the one", 3, "http://www.naver.com", "dj khaled"));
		System.out.println(bills.size());
		
		showAbout(bills.get(0));
		bills.remove(1);
		System.out.println(bills.size());
		System.out.println("-------");
		for(Billboard bb:bills) {
			showAbout(bb);
			}
		}
		
//		public static void showAbout(Billboard bb) {
//			//System.out.println("1----");
//			String sf = String.format("%d, %s, %d, %s, %s", 
//					bb.getRank(),bb.getSong(),bb.getLastWeek(),bb.getImagesrc(),bb.getArtist());
//			System.out.println(sf);
//		}
//	}

		public static void showAbout(Billboard bb) {
		// TODO Auto-generated method stub
			String sf = String.format("%d, %s, %d, %s, %s", 
				bb.getRank(),bb.getSong(),bb.getLastWeek(),bb.getImagesrc(),bb.getArtist());
			System.out.println(sf);
	}
}
