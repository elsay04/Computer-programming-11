public class Main {
    public static void main(String[] args) {
        // Initialize school: VLN
        School school = new School("VLN", "530 E 41st Ave, Vancouver, BC V5W 1P3", "Jim Rutley");

        // add 10 students with random grades.
        for (int i = 0; i < 10; i++) {
            int grade = (int)(Math.random() * 100);
            school.addStudent(new Student("Student" + i, "Lastname" + i, grade));
        }

        // add 3 teachers
        school.addTeacher(new Teacher("Gary", "Gray", "Math"));
        school.addTeacher(new Teacher("Jim", "Green", "Physics"));
        school.addTeacher(new Teacher("Jack", "Ma", "Computer science"));

        // print the student and teacher lists.
        System.out.println("Welcome to " + school.getName() +"! Here are all the students and teachers on board:");
        school.showStudents();
        school.showTeachers();

        // remove 2 students.
        school.deleteStudent(new Student(2023052905L));
        school.deleteStudent(new Student(2023052906L));

        // remove 1 teacher
        school.deleteTeacher(new Teacher("Jack", "Ma", "Computer science"));

        // print the updated lists.
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Sadly, 2 students and 1 teacher were removed from " +
                school.getName() +
                "! Here are the updated lists:");
        school.showStudents();
        school.showTeachers();
    }
}
