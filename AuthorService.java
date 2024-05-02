// Classe AuthorService
class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public boolean insertAuthor(Author author) {
        if (author.getAge() >= 12) {
            authorRepository.insert(author);
            return true;
        }
        return false;
    }

    public boolean deleteAuthor(int id) {
        Author author = authorRepository.findById(id);
        if (author != null) {
            authorRepository.delete(author);
            return true;
        }
        return false;
    }

    public boolean updateAuthor(int id, String newName) {
        Author author = authorRepository.findById(id);
        if (author != null) {
            author.setName(newName);
            return true;
        }
        return false;
    }

    public boolean authorExists(int id) {
        return authorRepository.findById(id) != null;
    }
}