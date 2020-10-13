import java.util.ArrayList;

public class Book {
    String title;
    ArrayList<Chapter> chapters=new ArrayList<>();
    ArrayList<Author> authors=new ArrayList<>();

    public Book(String s) {
        title=s;
    }

    public int createChapter(String name) {
        Chapter c=new Chapter(name);
        chapters.add(c);
        return chapters.indexOf(c);
    }

    public Chapter getChapter(int index){
        return chapters.get(index);
    }
    public void addAuthor(Author author) {
        authors.add(author);
    }
    public void print() {
        System.out.println("Book name: "+title);
        printAuthors();
        printChapters();
    }
    public void printChapters() {
        for(Chapter i:chapters){
            i.print();
        }
    }
    public void printAuthors() {
        for(Author i:authors){
            i.print();
        }
    }
}
