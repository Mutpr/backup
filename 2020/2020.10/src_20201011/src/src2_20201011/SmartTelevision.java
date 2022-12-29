package src2_20201011;

public class SmartTelevision implements RemoteControl{
	int volume;
	@Override
	public void turnOn() {
		System.out.println("텔레비전 전원을 킵니다");
	}

	@Override
	public void turnOff() {
		System.out.println("텔레비전 전원을 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(volume);
	}
}
