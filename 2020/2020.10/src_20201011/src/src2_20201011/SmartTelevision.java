package src2_20201011;

public class SmartTelevision implements RemoteControl{
	int volume;
	@Override
	public void turnOn() {
		System.out.println("�ڷ����� ������ ŵ�ϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("�ڷ����� ������ ���ϴ�");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(volume);
	}
}
