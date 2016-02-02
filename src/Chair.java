/**
 * Created by branden on 2/1/16.
 */
public class Chair {

    //create vars
    private boolean hasBack = true; //We talkin about a stool or a chair here?
    private int numberOfLegs = 4; //default is 4 legs. 4 on the floor.
    private boolean isHeightAdjustable; // defaults to false
    private double width;  //in inches

    //set constructors if needed
    public Chair (boolean hasBack, int numberOfLegs, boolean isHeightAdjustable, double width) {
        setHasBack(hasBack);
        setNumberOfLegs(numberOfLegs);
        setHeightAdjustable(isHeightAdjustable);
        setWidth(width);
    }


    /** Start getters and setters **/

    // hasBack
    public void setHasBack(boolean hasBack) { this.hasBack = hasBack; }
    public boolean getHasBack() { return hasBack; }

    //numberOfLegs
    public void setNumberOfLegs(int numberOfLegs) { this.numberOfLegs = numberOfLegs; }
    public int getNumberOfLegs() { return numberOfLegs; }

    //isHeightAdjustable
    public void setHeightAdjustable(boolean isHeightAdjustable) { this.isHeightAdjustable = isHeightAdjustable; }
    public boolean getHeightAdjustable() { return isHeightAdjustable; }

    //width
    public void setWidth(double width) { this.width = width; }
    public double getWidth() { return width; }

    /** End of getters and setters **/


}
