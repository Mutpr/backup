package src3_20201011;

public class Baby extends Animal{
	
	public Baby(String type) {
		super(type);
	}
	
	@Override
	public void run() {
		System.out.println("신생아: 기어 다닙니다.");
	}

	@Override
	public void sound() {
		System.out.println("신생아: 옹알이를 합니다.");
	}
}
