package src1;

public class Food {
	private int cost;
	private int kg;
	
	public Food(int cost, int kg) {
		//초기화 생성자 매개변수 
		this.cost = cost;
		this.kg = kg;
		//필드로 초기화
	}

	public Food() {
		//default 생성자 
		this(0,0); //중량의 값을 전부 0으로 초기화 
		//같은 클래스에서 오버로딩 된 생성자를 초기화
	}
	
	//설정자 메소드 : setter 메소드
	public void setCost(int cost) {
		this.cost = cost;
	}
	//접근자 메소드: getter 메소드
	public int getCost() {
		return cost;
	}
	
	public int getKg() {
		return kg;
	}
	
	@Override
	public String toString() {
		return "cost = "+ cost+"kg="+kg;
		//cost 와 kg의 가격과 중량?
	}
}
