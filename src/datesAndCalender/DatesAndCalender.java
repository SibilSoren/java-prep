package datesAndCalender;

import java.util.Calendar;
import java.util.Date;

public class DatesAndCalender {
    static void main() {
//        displayCurrentDate();
        displaySetDate();
    }


    public static void  displayCurrentDate(){
        Calendar calender = Calendar.getInstance();
        System.out.println(calender);
        Date date = new Date("25/12/2025");
        calender.setTime(date);
        System.out.println(calender.getTime());
    }

    static void displaySetDate(){
        Calendar calender = Calendar.getInstance();
        calender.set(2031,02,02);
        Date date = calender.getTime();
        System.out.println(date);
    }
}
