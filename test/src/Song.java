import java.util.ArrayList;

public class Song extends Element{


    public Song(String title, int size) {
        this.title = title;
        this.size=size;
        this.myList= new ArrayList<Element>();
    }

    public Song() {
    }
}