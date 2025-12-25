package datesAndCalender;

import java.util.Calendar;
import java.util.Date;

public class TransactionTester {
    static void main() {
        Transaction transaction = new Transaction("Deposit",new Date(),"1234",60.4);
        System.out.println(transaction);

        Calendar calender = Calendar.getInstance();
        System.out.println(calender.toString());
    }
}
