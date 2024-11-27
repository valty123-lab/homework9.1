import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publicYear;

    public Book (String name, Author author, int publicYear) {
        this.name = name;
        this.author = author;
        this.publicYear = publicYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", publicYear=" + publicYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicYear == book.publicYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publicYear);
    }

    public void setName(String name) {
        this.name = name;
    }
}
