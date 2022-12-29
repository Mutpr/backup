package src1_20200810;

public class Food {
 //가격, 중량 정보
	private int price;
	private double weight;
	
	public Food(int pr, double wei) {
		price = pr;
		weight = wei;
	}
	
	public void ShowInfo() {
		System.out.println("가격: "+price);
		System.out.println("중량: "+weight);
	}
	

}
