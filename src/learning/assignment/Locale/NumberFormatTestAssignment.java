package learning.assignment.Locale;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTestAssignment {
    public static void main(String[] args) {
        Long l = 12125435L;

        NumberFormat us = NumberFormat.getInstance(Locale.US);
        NumberFormat uk = NumberFormat.getInstance(Locale.UK);

        System.out.println(us.format(l));
        System.out.println(uk.format(l));



    }

}
