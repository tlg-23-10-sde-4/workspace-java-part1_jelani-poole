package net.flix;

public class Movie {
    // fields or instance variables (properties" or "attributes")
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    //constructors - these get called when clients say "new"
    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear) {
        this(title);                   // delegate to the 1-arg  for title
        setReleaseYear(releaseYear);  // handle releaseYear myself, by delegating to its setter
    }

    public Movie(String title, Integer releaseYear, Double revenue) {
        this(title, releaseYear); // delegate to the ctor above me for title, releaseYear
        setRevenue(revenue);      // handle revenue myself, by delegating to its setter
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating) {
        this(title, releaseYear, revenue);
        setRating(rating);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title, releaseYear, revenue, rating);
        setGenre(genre);
    }

    // business or "action" methods - not shown
    // pause(), play(), rewind(), fastForward(), skipTo()

    // accessor methods - provide "controlled access" to the object's fields
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        // TODO: get this right, so that if revenue is null, you use %s, and if not, go with %,.2f
        String revenueFormat = null;

        return String.format("Movie: title=%s, releaseYear=%s, revenue=%,.2f, rating=%s, genre=%s",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());



//        return "Movie: title= " + getTitle() + ", releaseYear= " + getReleaseYear() +
//                ", revenue= " + getRevenue() + ", rating= " + getRating() + ", genre= "
//                + getGenre();
    }
}