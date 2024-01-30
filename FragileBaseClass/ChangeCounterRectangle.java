package FragileBaseClass;

/**
 * Created by Niklas on 2016-02-02.
 *
 * Block 2-2: Inheritance, when and how?
 */
public class ChangeCounterRectangle extends Rectangle {

    /* FragileBaseClass.Rectangle:
      - width : int
      - height : int
      + getWidth() : int
      + getHeight() : int
      + getArea() : int
      + setWidth(int) : void
      + setHeight(int) : void
      + setSize(int, int) : void
     */

    public ChangeCounterRectangle(int w, int h){
        super(w,h);
    }

    private int nrOfWidthChanges = 0;
    private int nrOfHeightChanges = 0;
    public int getNrOfWidthChanges(){
        return nrOfWidthChanges;
    }
    public int getNrOfHeightChanges() {
        return nrOfHeightChanges;
    }

    @Override public void setWidth(int w){
        super.setWidth(w);
        nrOfWidthChanges += 1;
    }
    @Override public void setHeight(int h){
        super.setHeight(h);
        nrOfHeightChanges += 1;
    }

    @Override public void setSize(int w, int h){
        super.setSize(w,h);
        nrOfHeightChanges += 1;
        nrOfWidthChanges += 1;
    }

}
