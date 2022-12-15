import java.util.Objects;
public class Book {
    private String bookName;
    private Author author;
    private int publishingYear;
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    @Override
    public String toString() {
        return "Книга " + this.bookName + " Автор " + this.author + " Год " + this.publishingYear;
    }
    public String getBook() {
        String buratino = bookName;
        return bookName;
    }
    public Author getAuthor() {
        Author getAutor = author;
        return author;
    }
    public int getPublishingYear() {
        int year1 = publishingYear;
        return publishingYear;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book books = (Book) obj;
        return publishingYear == books.publishingYear && Objects.equals(bookName, books.bookName) && Objects.equals(author, books.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName, publishingYear, author);
    }
}

