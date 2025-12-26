package streams;

public class Student {
    private String studentId;
    private Integer score;
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName,String studentId, Integer score) {
        this.studentId = studentId;
        this.score = score;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public Integer getScore() {
        return score;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
