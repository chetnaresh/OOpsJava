package StudentManagement;

public abstract class Course {
    private String courseName;
    private String faculty;

    public Course(String courseName, String faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getFaculty() {
        return faculty;
    }

    public abstract void viewContent();

    public void enroll(Student student) {
        System.out.println(student.getName() + " enrolled in " + courseName + " with faculty " + faculty);
    }
}
