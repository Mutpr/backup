package kr.co.infopub.chapter.s082;

public class BillboardMain1 {
	public static void main(String args[]) {
		int rank=1; //정수 저장
		String song = "despacito";//문자열 저장
		int lastWeek = 1;
		String imageSrc = "www.naver.com"; //문자열 저장
		String artist = "Luis fonsi"; //문자열 저장
		String sf = String.format("%d, %s, %d, %s, %s", 
				rank,song,lastWeek,imageSrc,artist); //aw
		System.out.println(sf);
	}
}
