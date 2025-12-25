package RegEx;

public class RegExTester {
    static void main() {
        Person person = new Person("Sibil Soren","sibil@yolo.in");
        System.out.println(person);

        String text = "Hello";
        String text1 = "Hello";
//        System.out.println(text == text1);
//        System.out.println(text.equalsIgnoreCase("hello"));
        String newText = text.replace("H","F");
        System.out.println(newText);
    }


}
