import java.util.ArrayList;

public class MediaPlayer extends Playlist{
    public String title;
    public int size;

    public MediaPlayer(String title) {
        super();
        this.title=title;
        this.myList= new ArrayList<Element>();
    }

    public void addContent(Element e) {
        this.myList.add(e);
    }

    public MediaPlayer() {
    }

    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
