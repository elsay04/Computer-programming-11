import java.util.ArrayList;

/**
 * The {@code School} class that contains basic information of a school.
 * information includes name of the school, address and its principal.
 * Each school object holds a list of all teachers and a list of all students in the school.
 * In addition, this class provides several methods to manipulate teacher and student list data.
 * @author  Elsa You
 */
public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    // school properties.
    private String name;
    private String address;
    private String principal;

    // school constructor
    public School(String name, String address, String principal) {
        this.name = name;
        this.address = address;
        this.principal = principal;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * Add a teacher to the school.
     * @param teacher the teacher object to add.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Add a student to the school.
     * @param student the student object to add.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Delete a teacher from school.
     * @param teacher the teacher object to delete.
     */
    public void deleteTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    /**
     * Delete a student from school.
     * @param student the student object to delete.
     */
    public void deleteStudent(Student student) {
        students.remove(student);
    }

    /**
     * Display all teachers in the school.
     */
    public void showTeachers() {
        System.out.println("All teachers in " + this.name + ": ");
        for(Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    /**
     * Display all students in the school.
     */
    public void showStudents() {
        System.out.println("All students in " + this.name + ": ");
        for(Student student : students) {
            System.out.println(student);
        }
    }
}
