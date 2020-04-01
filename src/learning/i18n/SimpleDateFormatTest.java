package learning.i18n;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");

        String format = sdf.format(new Date());
        System.out.println(format);

        String dateAsString ="10-12-2014";
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy");
        Date parse = sdf1.parse(dateAsString);
        System.out.println(parse);
    }
}
