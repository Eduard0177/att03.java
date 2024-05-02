import java.util.*;

class BookRepository implements BookStorable {
    private List<Book> books = new ArrayList<>();

    @Override
    public void insert(Book book) {
        books.add(book);
    }

    @Override
    public void delete(Book book) {
        books.remove(book);
    }

    @Override
    public Book findById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findAll() {
        return books;
    }
}