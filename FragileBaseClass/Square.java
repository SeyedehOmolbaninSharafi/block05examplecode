package FragileBaseClass;

/**
 * Created by Niklas on 2016-02-02.
 *
 * Block 2-2: Inheritance, where and when
 */
public class Square extends Rectangle {

    public Square(int s){
        super(s,s);
    }

    public void setSize(int s){
        setHeight(s);
        setWidth(s);
    }

}
