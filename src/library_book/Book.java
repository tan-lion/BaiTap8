package library_book;

public class Book {
    private String title;
    private String author;
    private boolean status;

    public Book(String title, String author, boolean status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", status=" + status +
                '}';
    }
}
