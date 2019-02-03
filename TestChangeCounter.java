/**
 * Created by Niklas on 2016-02-02.
 *
 * Block 2-2: Inheritance, where and when
 */
public class TestChangeCounter {

    public static void main(String[] args){
        ChangeCounterRectangle ccr = new ChangeCounterRectangle(5,10);

        ccr.setHeight(7);
        ccr.setHeight(9);
        ccr.setSize(6,8);

        System.out.println(ccr.getNrOfHeightChanges());
    }
}
