// Movie Details Manager
// Q: How do you create multiple movie objects and display their details using a method?

class Movie {
    String name, language;
    double rating;

    Movie(String name, String language, double rating) {
        this.name = name;
        this.language = language;
        this.rating = rating;
    }

    void displayMovieDetails() {
        System.out.println("Movie: " + name + ", Language: " + language + ", Rating: " + rating + "/5");
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", "English", 4.8);
        Movie m2 = new Movie("Parasite", "Korean", 4.6);
        Movie m3 = new Movie("Dangal", "Hindi", 4.3);
        Movie m4 = new Movie("Spirited Away", "Japanese", 4.9);

        m1.displayMovieDetails();
        m2.displayMovieDetails();
        m3.displayMovieDetails();
        m4.displayMovieDetails();
    }
}
