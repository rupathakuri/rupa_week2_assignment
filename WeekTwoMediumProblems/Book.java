// Book Library (Manual Objects)
// Q: How do you create multiple objects of a class manually and display their details?

class Book {
    String title, author, ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void showDetails() {
        System.out.println("Book: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }

    public static void main(String[] args) {
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", "1234567890");
        Book b2 = new Book("1984", "George Orwell", "2345678901");
        Book b3 = new Book("To Kill a Mockingbird", "Harper Lee", "3456789012");
        Book b4 = new Book("Pride and Prejudice", "Jane Austen", "4567890123");
        Book b5 = new Book("The Catcher in the Rye", "J.D. Salinger", "5678901234");

        b1.showDetails();
        b2.showDetails();
        b3.showDetails();
        b4.showDetails();
        b5.showDetails();
    }
}
