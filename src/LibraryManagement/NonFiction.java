package LibraryManagement;

class NonFiction extends Book {
    private String subject;

    public NonFiction(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book: " + getTitle() + " | Subject: " + subject);
    }
}
