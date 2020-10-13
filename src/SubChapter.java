import java.util.ArrayList;

public class SubChapter {
    String name;
    ArrayList<Paragraph> paragraphs=new ArrayList<>();
    ArrayList<Table> tables=new ArrayList<>();
    ArrayList<Image> images=new ArrayList<>();

    public SubChapter(String s) {
        name=s;
    }
    public int createNewParagraph(String name){
        Paragraph p=new Paragraph(name);
        paragraphs.add(p);
        return paragraphs.indexOf(p);
    }
    public Paragraph getParagraph(int index){
        return paragraphs.get(index);
    }
    public void printParagraph() {
        for(Paragraph i:paragraphs){
            i.print();
        }
    }

    public int createNewImage(String name){
        Image i=new Image(name);
        images.add(i);
        return images.indexOf(i);
    }
    public Image getImage(int index){
        return images.get(index);
    }
    public void printImage() {
        for(Image i:images){
            i.print();
        }
    }

    public int createNewTable(String name){
        Table t=new Table(name);
        tables.add(t);
        return tables.indexOf(t);
    }
    public Table getTable(int index){
        return tables.get(index);
    }
    public void printTable() {
        for(Table i:tables){
            i.print();
        }
    }
    public void print() {
        System.out.println("Subchapter: "+name);
        printParagraph();
        printImage();
        printTable();
    }
}
