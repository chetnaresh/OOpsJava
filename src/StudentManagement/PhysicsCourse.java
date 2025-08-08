package StudentManagement;

public class PhysicsCourse extends Course {
    public PhysicsCourse(String faculty) {
        super("Physics", faculty);
    }

    @Override
    public void viewContent() {
        System.out.println("Physics Course Content: Mechanics, Thermodynamics, Optics");
    }
}

