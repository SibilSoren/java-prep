package streams;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StreamExample {
    static void main() {
        Student s1 = new Student("Sibil","Soren","1",45);
        Student s2 = new Student("Sib","Soren","2",65);
        Student s3 = new Student("Libs","Soren","3",42);
        Student s4 = new Student("Sibi","Soren","4",78);
        List<Student> students = List.of(s1,s2,s3,s4);
        System.out.println(getTopScore(students));


    }

    public static int getTopScore(List<Student> students){
        return students.stream()
                .filter(Objects::nonNull)
                .mapToInt(Student::getScore)
                .max()
                .orElse(0);
    }
}
