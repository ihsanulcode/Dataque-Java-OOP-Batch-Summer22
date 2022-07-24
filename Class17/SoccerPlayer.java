
public class SoccerPlayer {
	private String name;
	private String age;

	public SoccerPlayer() {

	}

	public SoccerPlayer(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SoccerPlayer [name=" + name + ", age=" + age + "]";
	}

	public void profile() {

	}

}
