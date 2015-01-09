
import java.util.ArrayList;

public class Student implements Comparable<Student> {

    private String schoolName;
    private int grade;
    private String lastName;
    private String firstName;
    private int id;

    public Student(String schoolName, int grade, String firstName, String lastName, int id) {
        this.schoolName = schoolName;
        this.grade = grade;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getSchoolName() {
        return this.schoolName;
    }

    public int getGrade() {
        return this.grade;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getID() {
        return this.id;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int compareTo(Student o) {
        //TODO
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
    }
}
