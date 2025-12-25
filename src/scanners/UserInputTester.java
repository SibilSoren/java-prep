package scanners;

import java.util.Scanner;

public class UserInputTester {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter a string");
            String userInput = scanner.nextLine();
            System.out.println("User Input: " + userInput);
        } catch (Exception e) {
            e.getLocalizedMessage();
        } finally {
            scanner.close();
        }
    }
}
