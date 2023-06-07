/**
 * The {@code Teacher} class that contains basic information of a teacher
 * information includes first name, last name and subject.
 * In addition, this class provides several methods for converting
 * a {@code Teacher} to a {@code String}
 * @author  Elsa You
 */
public class Teacher {
    // teacher properties
    private String firstName;
    private String lastName;
    private String subject;

    // teacher constructor
    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    /**
     * Convert a teacher object to string.
     * Shows teacher's name and subject
     * @return teacher in string format.
     */
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Subject: " + subject;
    }

    /**
     * Compares this teacher to the specified object.
     * Compare all the properties.
     * @param o the object to compare.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return firstName.equals(teacher.firstName) &&
                lastName.equals(teacher.lastName) &&
                subject.equals(teacher.subject);
    }
}
