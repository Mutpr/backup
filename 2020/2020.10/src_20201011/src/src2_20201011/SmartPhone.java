package src2_20201011;

public class SmartPhone implements RemoteControl{
	int volume;
	void method1(RemoteControl ac) {
		ac.turnOn();
		ac.turnOff();
		ac.setVolume(0);
	}
	@Override
	public void turnOn() {
		System.out.println("����Ʈ�� ������ ŵ�ϴ�");
	}
	@Override
	public void turnOff() {
		System.out.println("����Ʈ�� ������ ���ϴ�");
		
	}
	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(volume);
	}

}
