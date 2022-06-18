
public class TvRemote {

	public static void main(String[] args) {

		Tv sony = new Tv();
		sony.power();
		//sony.info();
		sony.setChannel(20);
		sony.setVolume(50);
		sony.info();
		sony.volumeUp();
		sony.volumeUp();
		sony.info();
		sony.channelUp();
		sony.channelUp();
		sony.channelUp();
		sony.info();
		sony.channelDown();
		sony.volumeDown();
		sony.volumeDown();
		sony.volumeDown();
		sony.volumeDown();
		sony.volumeDown();
		sony.info();
	}

}
