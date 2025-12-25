package genericsAndCollections;

public class Person implements Comparable<Person>{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return age.compareTo(person.age);
    }

    @Override
    public String toString() {
        return age + "";
    }
}
