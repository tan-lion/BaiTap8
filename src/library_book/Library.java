package library_book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void borrow(String title){
        for (Book book : books) {
            if(book.getTitle().equals(title)){
                book.setStatus(false);
            }
        }
    }

    public void return_book(String title){
        for (Book book : books) {
            if(book.getTitle().equals(title)){
                book.setStatus(true);
            }
        }
    }

    public void get_books() {


        for (Book book : books) {
            if (book.isStatus() == true) {
                System.out.println(book);
            }
        }
    }
}
