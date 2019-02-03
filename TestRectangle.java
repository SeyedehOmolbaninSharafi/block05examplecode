/**
 * Created by Niklas on 2016-02-02.
 *
 * Block 2-2: Inheritance, where and when
 */
public class TestRectangle {

    public static void main(String[] args){
        Rectangle r = new Square(5);

        //...

        r.setSize(3,6);
        System.out.println(r.getArea());
    }
}
