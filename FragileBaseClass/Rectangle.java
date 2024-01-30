package FragileBaseClass;

/**
 * Created by Niklas on 2016-02-02.
 *
 * Block 2-2: Inheritance, where and when
 */
public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int w, int h){
        this.width = w;
        this.height = h;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
    protected int getArea() { return width * height; }
    public void setWidth(int w) { this.width = w; }
    public void setHeight(int h) { this.height = h; }
    public void setSize(int w, int h) { setWidth(w); setHeight(h);}

}
