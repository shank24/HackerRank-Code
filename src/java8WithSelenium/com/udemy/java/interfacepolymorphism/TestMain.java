package java8WithSelenium.com.udemy.java.interfacepolymorphism;

public class TestMain {

    public static void main(String[] args) {

        GoogleMini g = new GoogleMini();
        IPhone i = new IPhone();
        Clock c = new Clock();
        alarmTest(g);
        alarmTest(i);
        alarmTest(c);

    }

    private static void alarmTest(Alarm al){
        al.setAlarm();
    }
}
