package LibraryManagement;

class Magazine extends Book {
    private int issueNumber;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine: " + getTitle() + " | Issue No: " + issueNumber);
    }
}
