package java8WithSelenium.com.udemy.java.interfacepolymorphism;

public class IPhone implements Alarm {

    public void dial(){
        System.out.println("Calling 123 from IPhone");
    }

    public void answerPhone(){
        System.out.println("Hello");
    }

    public void setAlarm(){
        System.out.println("IPhone - Setting an Alarm at 7:30 A:M");
    }
}
