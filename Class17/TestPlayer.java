import java.util.Arrays;

public class TestPlayer {

	public static void main(String[] args) {
//		SoccerPlayer player1 = new Forward("Mottasim Sadi", "20", 2);
//		SoccerPlayer player2 = new Midfielder("Rahat Kabir", "22", 3);
//		SoccerPlayer player3 = new Defender("Maisha Rahman", "18", 5);

//		player1.profile();
//		player2.profile();
//		player3.profile();

		// type[] name = new type[size];
		SoccerPlayer[] players = new SoccerPlayer[3];
		players[0] = new Forward("Mottasim Sadi", "20", 2);
		players[1] = new Midfielder("Rahat Kabir", "22", 3);
		players[2] = new Defender("Maisha Rahman", "18", 5);

		int f = 0;
		int m = 0;
		int d = 0;

		for (int i = 0; i < players.length; i++) {
			players[i].profile();

			// if(players[i] instanceof Defender) players[i].profile();
			if (players[i] instanceof Forward)
				f++;
			if (players[i] instanceof Midfielder)
				m++;
			if (players[i] instanceof Defender)
				d++;
		}

		System.out.println("Forward: " + f);
		System.out.println("Midfielder: " + m);
		System.out.println("Defender: " + d);

		// System.out.println(Arrays.toString(players));

	}

}
