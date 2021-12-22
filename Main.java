public class Main {
    public static void main(String[] args) {
        School school = new School("Sentinel", "California", 20);

        Student student1 = new Student("Henry", "Li", 9);
        Student student2 = new Student("Jen", "Hao", 10);
        Student student3 = new Student("Fred", "Meyers", 12);
        Student student4 = new Student("Kendall", "Lee", 11);
        Student student5 = new Student("Tyler", "Eden", 12);
        Student student6 = new Student("Jessica", "Nam", 10);
        Student student7 = new Student("Micheal", "Roeder", 9);
        Student student8 = new Student("Charlie", "An", 11);
        Student student9 = new Student("Dennis", "Jervis", 12);
        Student student10 = new Student("Patricia", "Otis", 9);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);
        school.addStudent(student6);
        school.addStudent(student7);
        school.addStudent(student8);
        school.addStudent(student9);
        school.addStudent(student10);

        Teacher teacher1 = new Teacher("Sherri", "Armstrong",  "English");
        Teacher teacher2 = new Teacher("Julie", "Popov",  "Science");
        Teacher teacher3 = new Teacher("Craig", "Griffiths",  "Social Studies");

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);

        school.showStudent();

        school.showTeacher();

        school.delStudent(student5);
        school.delStudent(student9);

        school.delTeacher(teacher2);

        school.showStudent();

        school.showTeacher();
    }
}
