import java.util.Objects;

public class Book {
    private String title;
    private final Author author;
    private int published;

    public Book(String title, Author author, int published) {
        this.title = title;
        this.author = author;
        this.published = published;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublished() {
        return this.published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String toString() {
        return "Название книги: " + this.title + ", автор: " + this.author + ", год издания: " + this.published;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Book book = (Book)o;
            return this.published == book.published && Objects.equals(this.title, book.title) && Objects.equals(this.author, book.author);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.title, this.author});
    }

    public void setAuthor(int published) {
        this.published = published;
    }

    }


