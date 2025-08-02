package my_project;
import java.util.*;

public class calender_example {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		System.out.println(d);
		c.set(2023,c.SEPTEMBER,13);
		int year = c.getWeekYear();
		System.out.println(year);
		int h = c.getFirstDayOfWeek();
		System.out.println(h);
		System.out.println("Day of week : " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("Day of year : " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("Week in month : " + c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Week in a year : " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Day of week in months : " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Hours : " + c.get(Calendar.HOUR));
		System.out.println ("Minute : " + c.get(Calendar.MINUTE));
		System.out.println("Second : " + c.get(Calendar.SECOND));
		System.out.println("AM or PM : " + c.get(Calendar.AM_PM));
		System.out.println("Hour (24-hour check) : " + c.get(Calendar.HOUR_OF_DAY));
		
		
		
		
		
		
	}

}
