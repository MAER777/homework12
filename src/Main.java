import homework12_1.Author;
import homework12_1.Book;

public class Main {


    public static void main(String[] args) {
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person john = new Person("John", 25);

        task();

    }

    public static void task() {
        System.out.println("Задача");
        Author tomasTim = new Author("Томас", "Тим");
        System.out.println("Автор книги - " + tomasTim.getAuthorName() + " " + tomasTim.getAuthorSurname());
        Author yilSun = new Author("Уил", "Сан");
        System.out.println("Автор книги - " + yilSun.getAuthorName() + " " + yilSun.getAuthorSurname());

        Book stream = new Book("Стрим", yilSun, 1230);
        System.out.println(stream.getNameBook() + ", автор " + stream.getNameAuthor() + ", выпущена в " + stream.getAgePublisher() + " году.");
        stream.setAgePublisher(333);
        System.out.println(stream.getNameBook() + ", автор " + stream.getNameAuthor() + ", выпущена в " + stream.getAgePublisher() + " году.");

        Book yellow = new Book("Желтая пелена", tomasTim, 2020);
        System.out.println(yellow.getNameBook() + ", автор " + yellow.getNameAuthor() + ", выпущена в " + yellow.getAgePublisher() + " году.");
    }
}