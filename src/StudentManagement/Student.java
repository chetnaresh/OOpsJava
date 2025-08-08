package StudentManagement;


import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> enrolledCourses = new ArrayList<>();
    private double grades; // encapsulated
    private int attendance; // encapsulated

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Public method to enroll in a course
    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.enroll(this);
    }

    public void viewAllCourses() {
        System.out.println(name + "'s Courses:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName());
            course.viewContent();
        }
    }

    // Encapsulation: grades & attendance are private
    public void setGrades(double grades) {
        this.grades = grades;
    }

    public double getGrades() {
        return grades;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public int getAttendance() {
        return attendance;
    }
}
