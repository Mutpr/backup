package src5_0526;
//실행 목적 클래스
import java.util.*;
public class CarTest {
	public static void main(String[] args) {
		//필드 작업
		//객체 생성 작업
		Scanner scan = new Scanner(System.in);
		Car car = new Car(); //생성자 호출, 객체 생성
		//객체참조변수 car가 뭘 참조하냐
		car.speed = 90;
		car.color = "blue";
		
		System.out.println("Color = "+car.color);
		System.out.println("Speed = "+car.speed);
		
		car.speedUp(40);
		car.speedDown(10);
		System.out.println("Speed = "+car.speed);
		
		
	}
}
