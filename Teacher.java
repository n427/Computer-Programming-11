// Teacher class that contains the first name, last name, and subject
public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }
    // Return the information property formatted
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + " Subject: " + this.subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
