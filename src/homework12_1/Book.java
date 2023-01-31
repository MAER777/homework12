package homework12_1;

public class Book {
    private String nameBook;
    private Author author;
    private int agePublisher;

    public Book (String nameBook, Author author, int agePublisher) {
        this.nameBook = nameBook;
        this.author = author;
        this.agePublisher = agePublisher;
    }

    public String getNameBook() {
        return this.nameBook;
    }
    public Author getNameAuthor() {
        return this.author;
    }

    public int getAgePublisher() {
        return this.agePublisher;
    }

    public void setAgePublisher(int agePublisher) {
        this.agePublisher = agePublisher;
    }
}
