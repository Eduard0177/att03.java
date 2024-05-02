import java.util.*;

// Interface BookStorable
interface BookStorable {
    void insert(Book book);
    void delete(Book book);
    Book findById(int id);
    List<Book> findAll();
}
