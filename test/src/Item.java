import java.util.ArrayList;
import java.util.List;

public class Item extends Playlist{
    public String title;
    public int size;
    public Item(String title,int size) {
        this.title = title;
        this.myList= new ArrayList<Element>();
    }

    public Item() {

    }
}
