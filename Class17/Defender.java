
public class Defender extends SoccerPlayer {
	private int save;

	public Defender() {

	}

	public Defender(String name, String age, int save) {
		super(name, age);
		this.save = save;
	}

	public int getSave() {
		return save;
	}

	public void setSave(int save) {
		this.save = save;
	}

	@Override
	public void profile() {
		System.out.println(
				"Defender [name=" + this.getName() + ", age=" + this.getAge() + ", save=" + this.getSave() + "]");
	}
}
