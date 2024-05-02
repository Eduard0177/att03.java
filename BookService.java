// Classe BookService
class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public boolean insertBook(Book book) {
        if (book.getAuthor().getAge() >= 12) {
            bookRepository.insert(book);
            return true;
        }
        return false;
    }

    public boolean deleteBook(int id) {
        Book book = bookRepository.findById(id);
        if (book != null) {
            bookRepository.delete(book);
            return true;
        }
        return false;
    }

    public boolean updateBook(int id, String newTitle) {
        Book book = bookRepository.findById(id);
        if (book != null) {
            book.setTitle(newTitle);
            return true;
        }
        return false;
    }

    public boolean bookExists(int id) {
        return bookRepository.findById(id) != null;
    }
}