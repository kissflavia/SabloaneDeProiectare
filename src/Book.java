public class Book {
    String title;
    String text;
    public Book(String s) {
        title=s;
        text="";
    }

    public void createNewParagraph(String s) {
        text=text+"\n"+s;
    }

    public void createNewImage(String s) {
        text=text+"\n"+s;
    }

    public void createNewTable(String s) {
        text=text+"\n"+s;
    }

    public void print() {
        System.out.println("\n"+title+"\n--------"+text);
    }
}
