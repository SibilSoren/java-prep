package datesAndCalender;

import java.util.Date;

public class Transaction {
    private String description;
    private Date date;
    private String account;
    private double amount;

    public Transaction(String description, Date date, String account, double amount) {
        this.description = description;
        this.date = date;
        this.account = account;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Description: " + this.description + " " + "\nDate: " + date + " \nAccount No.: " + account + " \nAmount: " + amount;
    }
}
