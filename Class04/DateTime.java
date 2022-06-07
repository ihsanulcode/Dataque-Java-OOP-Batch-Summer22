import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		
		//Date
		LocalDate date = LocalDate.now(); 
		System.out.println(date); //current date
		
		//Time
		LocalTime time = LocalTime.now();
		System.out.println(time); //current time
		
		//Date and Time
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime); //current date and time
		
		//Date and Time formatting
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formated = now.format(format); //converting to String
		System.out.println("After formatting: "+formated); //printing
		
		//12hours format with am/pm
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh.mm.ss aa");
		String dateString = dateFormat.format(new Date()).toString();
		System.out.println(dateString);

	}

}
