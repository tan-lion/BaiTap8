package library_book;

public class Main {
    public static void main(String[] args) {

        //Declare
        Book book = new Book("Cua so tam hom", "Ao Nhat Tan", true);
        Book book_1 = new Book("Dac nhan tam", "Ao Nhat Tan", true);
        Book book_2 = new Book("Het ten dat", "Ao Nhat Tan", true);
        Library library = new Library();

        //Input
        library.getBooks().add(book);
        library.getBooks().add(book_1);
        library.getBooks().add(book_2);

        //Output
        library.get_books();

        //borrow
        library.borrow("Cua so tam hom");
        System.out.println("List books after borrow: ");
        library.get_books();

        //return_book
        library.return_book("Cua so tam hom");
        System.out.println("List books after return: ");
        library.get_books();



    }
}
