import java.util.ArrayList;

// School class that contains the name, location, number of classrooms, teachers, students, and courses
public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<String> courses;
    private String schoolName;
    private String schoolLocation;
    private int numOfClassrooms;


    School(String schoolName, String schoolLocation, int numOfClassrooms) {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        courses = new ArrayList<>();
        this.schoolName = schoolName;
        this.schoolLocation = schoolLocation;
        this.numOfClassrooms = numOfClassrooms;
    }

    // Add teacher to the School
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    // Add student to the School
    public void addStudent(Student student) {
        students.add(student);
    }
    // Remove teacher from the School
    public void delTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }
    // Remove student from the School
    public void delStudent(Student student) {
        students.remove(student);
    }
    // Print out each teacher in the School
    public void showTeacher() {
        for(Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
    // Print out each student in the School
    public void showStudent() {
        for(Student student : students) {
            System.out.println(student);
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation;
    }

    public int getNumOfClassrooms() {
        return numOfClassrooms;
    }

    public void setNumOfClassrooms(int numOfClassrooms) {
        this.numOfClassrooms = numOfClassrooms;
    }
}
