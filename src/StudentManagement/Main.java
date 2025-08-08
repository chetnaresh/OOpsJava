package StudentManagement;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");

        Course math = new MathCourse("Dr. Smith");
        Course physics = new PhysicsCourse("Prof. Johnson");
        Course history = new HistoryCourse("Dr. Brown");

        student1.enrollInCourse(math);
        student1.enrollInCourse(physics);
        student1.enrollInCourse(history);

        student1.setGrades(89.5);
        student1.setAttendance(95);

        System.out.println("\n--- Course Details ---");
        student1.viewAllCourses();

        System.out.println("\nGrades: " + student1.getGrades());
        System.out.println("Attendance: " + student1.getAttendance() + "%");
    }
}
