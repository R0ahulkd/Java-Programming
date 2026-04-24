public class Book {
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static int totalBooks;

    static {
        totalBooks = 0;
    }

    Book (String isbn, String title, String author) {

    }
}