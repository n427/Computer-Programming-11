// Student class that contains the first name, last name, grade, and student number
public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    static int studentNum = 0;

    Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        studentNum++;
    }
    // Return the information property formatted
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + " Grade: " + this.grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
