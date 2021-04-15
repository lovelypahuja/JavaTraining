package JavaBasics2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
	//https://www.programiz.com/java-programming/examples/current-date-time
	

	public static void main(String[] args) {
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Current Date and Time is "+current);
	

	DateTimeFormatter Formatter =DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss.SSS");
	
			  String formatted = current.format(Formatter);
			  System.out.println(formatted);
			  
}}