import java.util.ArrayList;

public class Gif extends Element{

    public Gif(String title, int size) {
        this.title = title;
        this.size = size;
        this.myList= new ArrayList<Element>();
    }

    public Gif() {
    }
}