
public class Forward extends SoccerPlayer {
	private int goal;

	public Forward() {

	}

	public Forward(String name, String age, int goal) {
		super(name, age);
		this.goal = goal;
	}

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	@Override
	public void profile() {
		System.out.println(
				"Forward [name=" + this.getName() + ", age=" + this.getAge() + ", goal=" + this.getGoal() + "]");
	}

}
