import java.util.*;

// Interface AuthorStorable
interface AuthorStorable {
    void insert(Author author);
    void delete(Author author);
    Author findById(int id);
    List<Author> findAll();
}