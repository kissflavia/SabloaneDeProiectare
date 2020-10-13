import java.util.ArrayList;

public class Chapter {
    String name;
    ArrayList<SubChapter> subChapters=new ArrayList<>();
    public Chapter(String s) {
        name=s;
    }
    public int createSubChapter(String name){
        SubChapter c=new SubChapter(name);
        subChapters.add(c);
        return subChapters.indexOf(c);
    }
    public SubChapter getSubChapter(int index){
        return subChapters.get(index);
    }
    public void printSubChapters() {
        for(SubChapter i:subChapters){
            i.print();
        }
    }
    public void print() {
        System.out.println(name);
        printSubChapters();
    }
}
