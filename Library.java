import java.util.ArrayList;
import java.util.List;

/**
 * class Library contains lists for adding members and books and a field name for name of library
 * and also this class contains methods addBook,addMember,borrowBook,returnBook,searchBookByAuthor
 * and printLibraryInfo
 */
public class Library {

    String name;
    List<Book> books = new ArrayList<>();
    List<Member> members = new ArrayList<>();

    /**
     * this method adds a book to the list of books
     * @param book
     */
    public void addBook (Book book) {
        books.add(book);
    }

    /**
     * this method adds a member to the list of members
     * @param member
     */
    public void addMember (Member member) {
        members.add(member);
    }

    /**
     * this method is for borrowing books for any member it takes a book as parameter and add
     * it to the list of borrowed books of a member
     * @param member
     * @param book
     */
    public void borrowBook(Member member, Book book) {
        if (books.contains(book)) {
            member.borrowBook(book);
            books.remove(book);
        } else
            System.out.println("Error while borrowing book!");
    }

    /**
     * this method is for returning books. it removes the book from the list of borrowed books
     * of members and then add them again to library book list
     * @param member
     * @param book
     */
    public void returnBook(Member member, Book book) {
        member.returnBook(book);
        books.add(book);
    }

    /**
     * this method displays all library information like members and books info
     */
    public void printLibraryInfo () {
        System.out.println("--BOOKS INFO--");
        for (Book book : books)
            book.printBookInfo();
        System.out.println("--MEMBERS INFO--");
        for (Member member : members)
            member.printMemberInfo();

    }

    /**
     * this method searches a book by the name of its author
     * @param authorName
     */
    public void findBookByAuthor (String authorName) {
        for(Book book : books){
            if(book.getAuthor().equals(authorName.toLowerCase()))
                System.out.println(book.title);
        }
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

}