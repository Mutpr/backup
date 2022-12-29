package src1;

public class Answer_01 {
	public static void main(String [] args) {
		Melon m1 = new Melon(2500, 21, "Hallym_farm"); 
		//생성자 호출
		//자식 클래스로 생성해도 부모 클래스에 있는 것 까지 자동으로 생성됨
		Melon m2 = new Melon(2000, 10, "Software_farm");
		//생성자 호출22
		
		System.out.println("m1 객체 정보["+ m1 +"]");
		System.out.println("m2 객체 정보["+ m2 +"]\n");
		//toString() 호출 -> 객체 이름만 적어도 된다
		
		System.out.println(">>m2 객체의 cost와 경작농원 정보 변경 후");
		m2.setCost(3000); //m2의 설정값을 변경함(부모 클래스에 있음)
		m2.setInfo("JAVA_FARM");
		System.out.println(m2+"\n");
	}
}
