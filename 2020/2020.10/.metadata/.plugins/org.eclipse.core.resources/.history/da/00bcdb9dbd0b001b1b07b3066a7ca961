package src2_20201011;

public interface RemoteControl {
	public final static int MAX_VOLUME = 100;
	public int MIN_VOLUME=0;
	
	//추상 메소드 선언

	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	default void setMute(boolean mute) { //디폴트 메소드
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	static void changeBattery() { 
			System.out.println("건전지를 교환합니다.");
	}
		
	}

