package learning.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    public static void main(String[] args) {

        Date d = new Date();
        DateFormat usDF = DateFormat.getDateInstance(0, Locale.US);
        DateFormat ukDF = DateFormat.getDateInstance(0, Locale.UK);

        System.out.println(usDF.format(d));
        System.out.println(ukDF.format(d));

        DateFormat timeInstance = DateFormat.getTimeInstance(0);
        System.out.println(timeInstance.format(d));

        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(0, 0);
        System.out.println(dateTimeInstance.format(d));
    }
}
