package LibraryManagement;
public class Library {
    public static void main(String[] args) {
        Fiction f1 = new Fiction("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        NonFiction nf1 = new NonFiction("Sapiens", "Yuval Noah Harari", "History");
        Magazine m1 = new Magazine("National Geographic", "Various", 202);

        // Display details
        f1.displayDetails();
        nf1.displayDetails();
        m1.displayDetails();

        System.out.println("\n--- Issue and Return Operations ---");
        f1.issueBook();
        f1.issueBook();

        m1.issueBook();
        m1.returnBook();
        m1.returnBook();
    }
}
