package src1;

public class Food {
	private int cost;
	private int kg;
	
	public Food(int cost, int kg) {
		//�ʱ�ȭ ������ �Ű����� 
		this.cost = cost;
		this.kg = kg;
		//�ʵ�� �ʱ�ȭ
	}

	public Food() {
		//default ������ 
		this(0,0); //�߷��� ���� ���� 0���� �ʱ�ȭ 
		//���� Ŭ�������� �����ε� �� �����ڸ� �ʱ�ȭ
	}
	
	//������ �޼ҵ� : setter �޼ҵ�
	public void setCost(int cost) {
		this.cost = cost;
	}
	//������ �޼ҵ�: getter �޼ҵ�
	public int getCost() {
		return cost;
	}
	
	public int getKg() {
		return kg;
	}
	
	@Override
	public String toString() {
		return "cost = "+ cost+"kg="+kg;
		//cost �� kg�� ���ݰ� �߷�?
	}
}
