import java.util.Arrays;

/**
 * The {@code Book} class represents a book with attributes such as ID,
 * title, author, genre, availability status, and borrow count. It provides
 * methods for setting and getting these attributes, as well as for printing
 * book information and capitalizing the title of the book.
 */
public class Book {

    String id;             // The unique identifier of the book (length 5)
    String title;          // The title of the book
    String author;         // The author of the book
    boolean isAvailable = true; // Availability status of the book
    genre Genre;           // The genre of the book
    public int borrowCount = 0; // The count of times the book has been borrowed

    /**
     * The enumeration {@code genre} represents the genre of the book.
     */
    public enum genre {
        FICTION,
        NONFICTION,
        SCIENCE,
        HISTORY,
        FANTASY,
    }

    /**
     * Default constructor for the {@code Book} class.
     */
    public Book() {}

    /**
     * Constructs a {@code Book} instance with the specified ID, title,
     * author, and genre.
     *
     * @param id     the unique identifier of the book (must be length 5)
     * @param title  the title of the book
     * @param author the author of the book
     * @param genre  the genre of the book
     */
    public Book(String id, String title, String author, genre genre) {
        this.setId(id);
        this.setTitle(title);
        this.author = author;
        this.Genre = genre;
    }

    /**
     * Returns the ID of the book.
     *
     * @return the unique identifier of the book
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of the book. The ID must have a length of 5 characters.
     *
     * @param id the unique identifier to set
     * @throws IllegalArgumentException if the ID length is not 5
     */
    public void setId(String id) {
        if (id.length() != 5)
            throw new IllegalArgumentException("ID must have length 5");
        else
            this.id = id;
    }

    /**
     * Returns the title of the book.
     *
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book. The title will be capitalized.
     *
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = capitalizeTitle(title);
    }

    /**
     * Returns the author of the book.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author the author to set
     * @return the current instance of {@code Book}
     */
    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Checks if the book is available.
     *
     * @return {@code true} if the book is available, {@code false} otherwise
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Sets the availability status of the book.
     *
     * @param available the availability status to set
     * @return the current instance of {@code Book}
     */
    public Book setAvailable(boolean available) {
        isAvailable = available;
        return this;
    }

    /**
     * Returns the genre of the book.
     *
     * @return the genre of the book
     */
    public genre getGenre() {
        return Genre;
    }

    /**
     * Sets the genre of the book.
     *
     * @param genre the genre to set
     */
    public void setGenre(genre genre) {
        Genre = genre;
    }

    /**
     * Returns the borrow count of the book.
     *
     * @return the number of times the book has been borrowed
     */
    public int getBorrowCount() {
        return borrowCount;
    }

    /**
     * Increments the borrow count of the book by 1.
     */
    public void incrementBorrowCount() {
        this.borrowCount++;
    }

    /**
     * Displays all properties of the book to the console.
     */
    public void printBookInfo() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author + ", Genre: " + Genre + ", Borrow count: " + borrowCount);
    }

    /**
     * Capitalizes the first letter of each word in the title.
     *
     * @param title the title of the book to capitalize
     * @return the capitalized title
     */
    public String capitalizeTitle(String title) {
        String[] toUpperTitle = title.split(" ");
        String titleCap = "";
        for (int i = 0; i < toUpperTitle.length; i++) {
            toUpperTitle[i] = toUpperTitle[i].substring(0, 1).toUpperCase() + toUpperTitle[i].substring(1);
        }
        for (int i = 0; i < toUpperTitle.length; i++) {
            if (i > 0) {
                titleCap += " ";
            }
            titleCap += (toUpperTitle[i]);
        }
        return titleCap;
    }
}