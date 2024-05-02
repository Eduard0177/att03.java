// Classe abstrata Document
abstract class Document {
    private int id;
    private String title;

    public Document(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
