package learning.i18n;

import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale aDefault = Locale.getDefault();
        System.out.println(aDefault.getCountry());
        System.out.println(aDefault.getLanguage());
        System.out.println(aDefault.getDisplayCountry());
        System.out.println(aDefault.getDisplayLanguage());

        System.out.println(aDefault.getISO3Country());
        String[] isoCountries = Locale.getISOCountries();

        for (String val:isoCountries) {
            System.out.println(val);
        }
    }
}
