import java.util.ArrayList;
import java.util.List;

public class Playlist extends Element{
    public Playlist(String title) {
        this.title = title;
        this.myList= new ArrayList<Element>();
    }

    public Playlist() {
    }

    public void addContent(Element e) {
        this.myList.add(e);
    }
}