package days_30;

import java.io.IOException;
import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Solution_6_Date_Time {

	public static void main(String[] args) throws IOException {
  
        String year="2015";
        String month="10";
        String day="10";
        
        DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
        String weekdays[] = dfs.getWeekdays();
                
        Calendar cal = new GregorianCalendar(Locale.US);
        cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));

        System.out.println(weekdays[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase());
        
        
	
	}
	
		
}
