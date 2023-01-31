package homework12_1;

public class Author {
    private String authorName;
    private String authorSurname;
    private String authorFullName;

    public Author (String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }
    public String getAuthorSurname() {
        return this.authorSurname;
    }

    public String getAuthorFullName() {
        return this.authorFullName = authorName + " " + authorSurname;
    }
}
