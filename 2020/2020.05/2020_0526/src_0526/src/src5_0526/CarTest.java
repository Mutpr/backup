package src5_0526;
//���� ���� Ŭ����
import java.util.*;
public class CarTest {
	public static void main(String[] args) {
		//�ʵ� �۾�
		//��ü ���� �۾�
		Scanner scan = new Scanner(System.in);
		Car car = new Car(); //������ ȣ��, ��ü ����
		//��ü�������� car�� �� �����ϳ�
		car.speed = 90;
		car.color = "blue";
		
		System.out.println("Color = "+car.color);
		System.out.println("Speed = "+car.speed);
		
		car.speedUp(40);
		car.speedDown(10);
		System.out.println("Speed = "+car.speed);
		
		
	}
}
