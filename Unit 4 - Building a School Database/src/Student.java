import java.util.Objects;

/**
 * The {@code Student} class that contains basic information of a student
 * information includes first name, last name, grade and student number.
 * In addition, this class provides several methods for converting
 * a {@code Student} to a {@code String}
 * @author  Elsa You
 */
public class Student {
    // a counter to auto generate student number upon construction.
    private static Long count = 2023052901L;
    // student properties
    private String firstName;
    private String lastName;
    private int grade;
    private long studentNumber;

    // student full constructor
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        // get the current count as student number, then increase the counter by 1.
        this.studentNumber = count;
        count++;
    }

    // constructor with student number only.
    public Student(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    // Getters and setters here
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

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * Convert a student object to string.
     * Shows student name, grade and student number
     * @return student in string format.
     */
    @Override
    public String toString() {
        return "Student Name: " + firstName + " " + lastName +
                ", Grade: " + grade +
                ", Student Number: " + studentNumber;
    }

    /**
     * Compares this student to the specified object.
     * if 2 students objects have the same student number, they are the same student.
     * @param o the object to compare.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentNumber == student.studentNumber;
    }
}
