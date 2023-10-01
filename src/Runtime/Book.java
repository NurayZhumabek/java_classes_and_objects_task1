package Runtime;

public class Book {
    String author;
    String title;
    int id;
    float rating;
    int countScore;
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", id=" + id +
                '}';
    }

    // Метод вывода информации о книге
    void display() {
        System.out.println("ID: " + id + " | Book: '" + title + "' by Author: '" + author + "'");
    }
}