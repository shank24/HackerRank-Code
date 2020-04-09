package java8WithSelenium.com.udemy.java.interfacepolymorphism;

import java.time.LocalDateTime;

public class Clock implements Alarm {


    public void showTime(){
        System.out.println("It is " + LocalDateTime.now());
    }


    public void setAlarm(){
        System.out.println("Clock - Setting an Alarm at 7:30 A:M");
    }
}
