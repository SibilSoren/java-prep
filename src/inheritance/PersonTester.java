package inheritance;

public class PersonTester {
    static void main() {
        Person sally = new Person("Sally", "Phillips");
        System.out.println(sally);

        Student mike = new Student("Mike","Thompson","001");
        System.out.println(mike);

        StudentEmployee jeff = new StudentEmployee("Jeff","Sam","003",22.5, "E002");
        System.out.println(jeff);
    }
}
