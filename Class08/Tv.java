
public class Tv {
	//data fields
	int channel;
	int volumeLevel;
	boolean on;
	
	public Tv() {
		this.channel = 1;
		this.volumeLevel = 20;
		this.on = false;
	}
	
	public void turnOn() {
		this.on = true;
	}
	
	public void turnOff() {
		this.on = false;
	}
	
	public void power() {
		if(on) on = false;
		else on = true;
	}

	public void setChannel(int newChannel) {
		if(on) channel = newChannel;
	}
	
	public void setVolume(int newVolume) {
		if(on) volumeLevel = newVolume;
	}
	
	public void channelUp() {
		if(on) this.channel++;
	}
	
	public void channelDown() {
		if(on) this.channel--;
	}
	
	public void volumeUp() {
		if(on) this.volumeLevel++;
	}
	
	public void volumeDown() {
		if(on) this.volumeLevel--;
	}
	
	public void info() {
		if(on) {
			System.out.println("Channel: "+this.channel);
			System.out.println("Volume Level: "+this.volumeLevel);
		}else {
			System.out.println("Age Tv on koro mia!");
		}
	}
}
