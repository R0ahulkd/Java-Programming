public class Book {
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static int totalBooks;

    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book (String isbn, String title, String author) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }
    Book (String isbn) {
        this(isbn, "Unknown","Unknown");
    }

    static int getTotalNoBooks () {
        return totalBooks;
    }

    void BorrowBook () {
        if (isBorrowed) {
            System.out.println("Book is already Borrowed.");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title + " Book.");
        }
    }

    void returnBook () {
        if(isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave review.");
        } else {
            System.out.println("This book is already in the library.");
        }
    }

    public static void main(String[] args) {
        Book designofThings = new Book("1","Design","Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoBooks());
        designofThings.BorrowBook();
        myBook.BorrowBook();
        designofThings.BorrowBook();
        designofThings.returnBook();
    }
}