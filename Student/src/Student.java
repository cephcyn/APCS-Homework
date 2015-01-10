
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
        //test school
        int i = getSchoolName().compareTo(o.getSchoolName());
        if (i != 0) {
            return i;
        }
        //test grade
        i = getGrade() - o.getGrade();
        if (i != 0) {
            return i;
        }
        //test last name
        i = getLastName().compareTo(o.getLastName());
        if (i != 0) {
            return i;
        }
        //test first name
        i = getFirstName().compareTo(o.getFirstName());
        if (i != 0) {
            return i;
        }
        //test student id
        return getID() - o.getID();
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Generic High School", 12, "John", "Smiththisnameisafakename", 1234567));
        list.add(new Student("Ridgewing Private", 10, "Bobby", "Robert'); DROP TABLE students;--", 8920371));
        list.add(new Student("Video Game High School", 8, "Daniel", "Li", 4986257));
        list.add(new Student("Ridgewing Private", 5, "Elaine", "Robert", 1467355));
        list.add(new Student("Video Game High School", 8, "Daniel", "Li", 1643589));
        list.add(new Student("Generic High School", 6, "Helpimtrappedin", "anamegeneratingprogram", 4986357));
        list.add(new Student("This Is Not A High School", 1, "Amara", "Liu", 431613));
        list.add(new Student("Derpy Middle School", 7, "Sophie", "Altira", 49883));
        list.add(new Student("Derpy Middle School", 7, "Kenny", "Altira", 49884));
        list.add(new Student("Derpy Middle School", 7, "Benny", "Altira", 49895));
        list.add(new Student("Generic Middle School", 9, "Leslie", "Burke", 66576));
        String print = "";
        for (Student student : list) {
            print += student.getFirstName() + " "
                    + student.getLastName() + " "
                    + "(ID: " + student.getID() + "): "
                    + student.getSchoolName() + " "
                    + "grade " + student.getGrade() + "\n";
        }
        System.out.print(print);
    }
}
