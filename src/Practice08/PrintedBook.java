package Practice08;

public class PrintedBook extends Publication{
    private int pageCount;
    private String coverType;

    public PrintedBook(String title, String author, int releaseYear,
                       int pageCount, String coverType) {

        super(title, author, releaseYear);

        this.pageCount = Math.max(0, pageCount);
        this.coverType = coverType;
    }

    @Override
    public String toString() {

        return "PrintedBook{" + super.toString() +
                ", pages=" + pageCount +
                ", cover='" + coverType + "'}";
    }
}
