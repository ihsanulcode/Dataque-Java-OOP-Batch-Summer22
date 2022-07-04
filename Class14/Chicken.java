
public class Chicken extends Animal implements Edible {

	@Override
	public String howToEat() {
		return "Chicken Fry";
	}

	@Override
	public String sound() {
		return "Kukurukku!";
	}

}
