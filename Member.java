import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Member} class represents a library member with attributes such as
 * member ID, name, address, and a list of borrowed books. It provides methods
 * for borrowing and returning books, updating the member's address, and printing
 * member information.
 */
public class Member {

    String memberId;                 // The unique identifier for the member (length 6)
    String name;                     // The name of the member
    List<Book> borrowedBooks = new ArrayList<>(); // A list of books borrowed by the member
    Address memberAddress;           // The address of the member

    /**
     * Constructs a {@code Member} instance with the specified member ID and name.
     *
     * @param memberId the unique identifier for the member (must be length 6)
     * @param name     the name of the member
     * @throws IllegalArgumentException if the member ID length is not 6
     */
    public Member(String memberId, String name) {
        if (memberId.length() != 6)
            throw new IllegalArgumentException("memberId must be 6 characters");
        else
            this.memberId = memberId;
        this.name = name;
    }

    /**
     * Returns the member's address.
     *
     * @return the address of the member
     */
    public Address getMemberAddress() {
        return memberAddress;
    }

    /**
     * Sets the member's address.
     *
     * @param memberAddress the address to set
     */
    public void setMemberAddress(Address memberAddress) {
        this.memberAddress = memberAddress;
    }

    /**
     * Borrows a book for the member. It checks if the member has less than three
     * borrowed books and if the book is available. If both conditions are met,
     * it adds the book to the borrowed books list and marks the book as unavailable.
     *
     * @param book the book to borrow
     */
    public void borrowBook(Book book) {
        if (borrowedBooks.size() < 3 && book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            book.incrementBorrowCount();
        } else if (borrowedBooks.size() >= 3) {
            System.out.println("Already Borrowed 3 books!");
        } else {
            System.out.println("Book is not available");
        }
    }

    /**
     * Returns a borrowed book. It checks if the book exists in the list of borrowed
     * books and removes it. The book's availability is then set to true.
     *
     * @param book the book to return
     */
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
        }
    }

    /**
     * Displays all information about the member, including name, ID, address,
     * and all borrowed books.
     */
    public void printMemberInfo() {
        System.out.println("{\n\t" + "Member ID: " + memberId + ", Member name: " + name + ", ");
        memberAddress.printAddressInfo();
        for (Book book : borrowedBooks) {
            System.out.print("\t\t");
            book.printBookInfo();
        }
        System.out.println("}");
    }

    /**
     * Updates the member's address with a new address.
     *
     * @param newAddress the new address to set
     */
    public void updateAddress(Address newAddress) {
        this.setMemberAddress(newAddress);
    }

    /**
     * Sets the list of borrowed books for the member.
     *
     * @param borrowedBooks the list of borrowed books to set
     */
    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}