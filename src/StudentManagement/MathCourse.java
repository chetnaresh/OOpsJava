package StudentManagement;

public class MathCourse extends Course {
    public MathCourse(String faculty) {
        super("Mathematics", faculty);
    }

    @Override
    public void viewContent() {
        System.out.println("Math Course Content: Algebra, Calculus, Geometry");
    }
}
