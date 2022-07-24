
public class Midfielder extends SoccerPlayer {
	private int assist;

	public Midfielder() {

	}

	public Midfielder(String name, String age, int assist) {
		super(name, age);
		this.assist = assist;
	}

	public int getAssist() {
		return assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}

	@Override
	public void profile() {
		System.out.println(
				"Midfielder [name=" + this.getName() + ", age=" + this.getAge() + ", assist=" + this.getAssist() + "]");
	}
}
