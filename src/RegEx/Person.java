package RegEx;

import java.util.regex.Pattern;

public class Person {
    private String name;
    private String email;
    private final String emailRegEx = "^(.+)@(.+).(.+)$";
    private final Pattern pattern = Pattern.compile(emailRegEx);

    public Person(String name, String email) {
        if(!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Error, Invalid email");
        }
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + " email: " + email;
    }
}
