//Create a class Book with attributes title and author. Initialize them using a constructor, and print the details using a method showBook().
public class BookDetails {
    public static void main(String[] args) {
        Book myBook = new Book("The Alchemist", "Paulo Coelho");
        myBook.showBook();
    }
}

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
