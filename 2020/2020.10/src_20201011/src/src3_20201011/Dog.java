package src3_20201011;

public class Dog extends Animal{
	
	public Dog(String type) {
		super(type);
	}
	@Override
	public void run() {
		System.out.println("강아지: 네발로 다닙니다.");
	}
	@Override
	public void sound() {
		System.out.println("강아지: 멍멍 소리를 냅니다.");
	}
}
