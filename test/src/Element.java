import java.util.List;

public class Element {
    public List<Element> myList;
    public String title;
    public int size;

    public void add(Element element)
    {
        myList.add(element);
    }
    public void remove(Element element) {
        myList.remove(element);
    }
}