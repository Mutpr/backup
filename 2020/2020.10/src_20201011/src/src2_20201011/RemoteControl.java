package src2_20201011;

public interface RemoteControl {
	public final static int MAX_VOLUME = 100;
	public int MIN_VOLUME=0;
	
	//�߻� �޼ҵ� ����

	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	default void setMute(boolean mute) { //����Ʈ �޼ҵ�
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	static void changeBattery() { 
			System.out.println("�������� ��ȯ�մϴ�.");
	}
		
	}

