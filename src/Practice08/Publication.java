package Practice08;

public class Publication {
    private String title;
    private String author;
    private int releaseYear;

    public Publication(String title, String author, int releaseYear) {

        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {

        return "Publication{title='" + title +
                "', author='" + author +
                "', year=" + releaseYear + "}";
    }
}
