import java.util.ArrayList;

public class Video extends Element{

    public Video(String title, int size) {
        this.title = title;
        this.size=size;
        this.myList= new ArrayList<Element>();
    }

    public Video() {
    }
}