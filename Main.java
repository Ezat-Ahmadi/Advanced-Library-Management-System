import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The {@code Main} class serves as the entry point for the library management system.
 * It initializes a {@code Library}, adds books and members to it, and demonstrates
 * basic library operations such as borrowing and returning books.
 */
public class Main {
    /**
     * The main method initializes the library system by creating a new instance of
     * {@code Library}, adding a list of books and members, and allowing members to
     * borrow and return books. It also updates member addresses and prints the
     * library's information.
     *
     * @param args command-line arguments (not used in this implementation)
     */
    public static void main(String[] args) {

        Library library = new Library();

        List<Book> booksList = new ArrayList<Book>();
        library.setBooks(booksList);

        List<Member> memberssList = new ArrayList<Member>();
        library.setMembers(memberssList);

        Scanner sc = new Scanner(System.in);

        String id;
        String title;
        String author;

        // Create sample books
        Book book1 = new Book("id001", "my title is this", "author1", Book.genre.FANTASY);
        Book newBook = new Book("id002", "newTitle", "author1", Book.genre.FICTION);
        Book book2 = new Book("id003", "title2", "author2", Book.genre.FICTION);
        Book book3 = new Book("id004", "title3", "author3", Book.genre.HISTORY);
        Book book4 = new Book("id005", "title4", "author4", Book.genre.FANTASY);
        Book book5 = new Book("id006", "title5", "author5", Book.genre.NONFICTION);

        // Create sample members
        Member member = new Member("123456", "Ezat");
        Member member2 = new Member("234567", "Milad");

        // Add books to the list
        booksList.add(newBook);
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);

        // Add members to the list
        memberssList.add(member);
        memberssList.add(member2);

        // Perform borrow and return operations
        member.borrowBook(book1);
        member.borrowBook(book2);
        member.returnBook(book2);
        member2.borrowBook(book1);
        member2.borrowBook(book2);

        // Update member addresses
        Address address = new Address("TEH", "Hafez", "12345");
        member2.updateAddress(address);
        member.updateAddress(address);

        // Print library information
        library.printLibraryInfo();
    }
}