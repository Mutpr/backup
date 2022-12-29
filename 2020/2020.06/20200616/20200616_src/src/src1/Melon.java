package src1;

class Melon extends Food { //food 상속하는 melon 클래스 작성
	private String info; //경작 농원 정보
	
	public Melon(int cost, int kg, String info) { //생성자 매개변수
		//가격과 중량 정보 다 받아 옴
		//부모 클래스의 매개변수 전부 받아와서 필요한 값 전달
		super(cost,kg); //Food 의 생성자 호출
		this.info = info; 
	}
	
	public Melon() {
		super(); //반드시 해줄 필요 x
		info = null;
	}
	
	public void setInfo(String info) { //설정자 
		this.info = info;
	}
	
	public String getInfo() { //접근자
		return info;
	}
	
	public String toString() {
		String str = super.toString(); 
		/*
		 * 부모 클래스의 toString() 객체를 사용함
		 * 클래스 Food 의 toString() 이 필요함 -> 상속 받음
		 * Food의 toString() 객체의 결과를 받음.
		 */
		str += this.info;
		return str;
	}
}
