package src1_20200810;

public class Food {
 //����, �߷� ����
	private int price;
	private double weight;
	
	public Food(int pr, double wei) {
		price = pr;
		weight = wei;
	}
	
	public void ShowInfo() {
		System.out.println("����: "+price);
		System.out.println("�߷�: "+weight);
	}
	

}
