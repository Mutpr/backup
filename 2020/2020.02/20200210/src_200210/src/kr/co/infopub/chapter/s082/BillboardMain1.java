package kr.co.infopub.chapter.s082;

public class BillboardMain1 {
	public static void main(String args[]) {
		int rank=1; //���� ����
		String song = "despacito";//���ڿ� ����
		int lastWeek = 1;
		String imageSrc = "www.naver.com"; //���ڿ� ����
		String artist = "Luis fonsi"; //���ڿ� ����
		String sf = String.format("%d, %s, %d, %s, %s", 
				rank,song,lastWeek,imageSrc,artist); //aw
		System.out.println(sf);
	}
}
