package StudentManagement;
public class HistoryCourse extends Course {
    public HistoryCourse(String faculty) {
        super("History", faculty);
    }

    @Override
    public void viewContent() {
        System.out.println("History Course Content: Ancient Civilizations, World Wars, Modern History");
    }
}

