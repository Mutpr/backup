package kr.co.infopub.chapter.s082;

public class BillboardMain2 {
	public static void main(String args[]) {
		Billboard b1 = new Billboard(1,"Despacito",1,"http://www.naver.com","Luis fonsi"); //������ ��ü�� ����
		//�����ϸ鼭 ����, ���, �� �� ����, ���� ����, ������� �����Ͽ� �ʱ�ȭ��
		showAbout(b1); // ������ ��ü�� ������ ���.
		
		Billboard b = b1; //�ּҸ� ������
		showAbout(b); // �ּ��� ��ü ������ ���
	}
	
	public static void showAbout(Billboard bb) { // ��ü�� �����Ͽ� ����ϴ� Ŭ����
		String sf = String.format("%d, %s, %d, %s, %s", bb.getRank(),bb.getSong(), bb.getLastWeek(), bb.getImagesrc(),bb.getArtist()); //Billboard Ŭ�������� ������ ��ü�� �����Ͽ� �����
		System.out.println(sf);
		
	}
}
