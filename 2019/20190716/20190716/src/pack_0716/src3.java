/*
 * Ű����� while�� ����
 * Ű����� �Է��� 3���� �ӵ� ���� -> ����, ����, ���� ��
 * if���� ����ؼ� ó��.
 */
package pack_0716;

public class src3 {
	public static void main(String args[]) throws Exception {
		
		boolean run = true;
		int speed = 0;
		int KeyCode = 0;
		
		while(run) {
			if(KeyCode != 10 && KeyCode != 13) {
				
		}
			 System.in.read(); //Ű������ Ű�ڵ� ���� �о �����ϴ� ��. (io �����)
			System.out.println(KeyCode); //�Էµ� Ű�� Ű�ڵ�� �����.
		} //int keycode �� ���ؼ� ��Ʈ�� ���� �� �� �ְ� ��. ���� �ߴ� ������ ����ó���� ���� �ʾƼ�. 
			//�� ���·� ����ϸ� Ű�ڵ�+ 13�� 10�� ���� ��µ�. 13���� ĳ���� ����, 10�� �����ǵ�.
	}
		
}
