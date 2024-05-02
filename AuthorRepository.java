import java.util.*;

// Classe AuthorRepository
class AuthorRepository implements AuthorStorable {
    private List<Author> authors = new ArrayList<>();

    @Override
    public void insert(Author author) {
        authors.add(author);
    }

    @Override
    public void delete(Author author) {
        authors.remove(author);
    }

    @Override
    public Author findById(int id) {
        for (Author author : authors) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    }

    @Override
    public List<Author> findAll() {
        return authors;
    }
}
