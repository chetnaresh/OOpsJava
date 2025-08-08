package LibraryManagement;

class Fiction extends Book {
    private String genre;

    public Fiction(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        System.out.println("Fiction Book: " + getTitle() + " | Genre: " + genre);
    }
}
