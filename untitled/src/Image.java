public class Image extends Element{
    public String URL;
    public Image(String s) {
        this.URL=s;
    }

    @Override
    public void add(Element element) {
    }

    @Override
    public void get(int id) {
    }

    @Override
    public void remove(Element element) {
    }

    public void print()
    {
        System.out.println("Image with Image name:"+URL);
    }
}