package exceptionHandling;

public class Phone {
    private String phoneType;
    private String phoneNumber;

    public Phone(String phoneType, String phoneNumber) {

        if(phoneType == null || phoneNumber == null){
            throw new IllegalArgumentException("The type and the number cannot be null");
        }

        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return this.phoneType + " " + this.phoneNumber;
    }
}
