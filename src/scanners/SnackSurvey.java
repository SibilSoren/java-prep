package scanners;

import java.util.Scanner;

public class SnackSurvey {
    static void main() {
        boolean keepRunning = true;
        try (Scanner scanner = new Scanner(System.in)){
            while(keepRunning){
                try{
                    System.out.println("What should be in the snack?");
                    System.out.println("1. Samosa");
                    System.out.println("2. Pizza");
                    System.out.println("3. Burger");
                    System.out.println("Please enter your selection:");
                    int selection = Integer.parseInt(scanner.nextLine());

                    if(selection == 1){
                        System.out.println("So SAMOSA it is!");
                        keepRunning = false;
                    }else if(selection == 2){
                        System.out.println("Pizza!!!");
                        keepRunning = false;
                    }else if(selection == 3){
                        System.out.println("It's burger time!!!");
                        keepRunning = false;
                    }else{
                        System.out.println("\nPlease provide a input between 1 - 3\n");
                    }
                }catch(Exception ex){
                    System.out.println("\nInvalid input\n");
                }
            }
        }
    }
}
