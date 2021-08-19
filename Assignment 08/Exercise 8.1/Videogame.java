
public class Videogame extends Item {

    private String genre;
    private String publisher;
    private String studio;

    public Videogame(String title, int time) {
        super(title, time);
    }

    public Videogame(String title, int time, String studio) {
        this(title, time);
        this.studio = studio;
    }

    public Videogame(String title, int time, String studio, String publisher) {
        this(title, time, studio);
        this.publisher = publisher;
    }

    public Videogame(String title, int time, String studio, String publisher, String genre) {
        this(title, time, studio, publisher);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getStudio() {
        return studio;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
