package kr.co.infopub.chapter.s082;

public class BillboardMain2 {
	public static void main(String args[]) {
		Billboard b1 = new Billboard(1,"Despacito",1,"http://www.naver.com","Luis fonsi"); //빌보드 객체를 생성
		//생성하면서 순위, 곡명, 전 주 순위, 사진 정보, 기수명을 대입하여 초기화함
		showAbout(b1); // 빌보드 객체의 정보를 출력.
		
		Billboard b = b1; //주소를 복사함
		showAbout(b); // 주소의 객체 내용을 출력
	}
	
	public static void showAbout(Billboard bb) { // 객체를 전달하여 출력하는 클래스
		String sf = String.format("%d, %s, %d, %s, %s", bb.getRank(),bb.getSong(), bb.getLastWeek(), bb.getImagesrc(),bb.getArtist()); //Billboard 클래스에서 선언한 객체를 전달하여 출력함
		System.out.println(sf);
		
	}
}
