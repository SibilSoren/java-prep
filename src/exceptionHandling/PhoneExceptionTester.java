package exceptionHandling;

public class PhoneExceptionTester {
    static void main() {
        String[] numbers = new String[] {"123-456",null,"4513-123123","341-12341"};

        for(int i = 0; i < numbers.length; i++){
            try{
                System.out.println(new Phone("Iphone", numbers[i]));
            }catch(IllegalArgumentException ex){
                System.out.println(ex.getLocalizedMessage());
            }
        }
    }


}
