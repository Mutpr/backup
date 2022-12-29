package src5_0526;
//자동차
//상태: 속도 색상
//동작: 스피드 업 다운
public class Car {
	int speed;
	String color;
	
	void speedUp(int s) {
		speed+=s;
	}
	
	void speedDown(int s) {
		speed-=s;
	}
	
	
	
}
