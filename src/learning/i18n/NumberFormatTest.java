package learning.i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {

        Double d= 1233434343.43444;
        NumberFormat nf = NumberFormat.getInstance(Locale.CANADA);
        nf.setMinimumFractionDigits(5);
        nf.setMaximumFractionDigits(3);

        nf.setMaximumIntegerDigits(4);
        System.out.println(nf.format(d));


    }
}
