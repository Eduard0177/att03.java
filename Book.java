// Classe Book
class Book extends Document {
    private Author author;

    public Book(int id, String title, Author author) {
        super(id, title);
        this.author = author;
    }

    // Getter e setter para o autor
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}