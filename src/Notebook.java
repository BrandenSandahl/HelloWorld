/**
 * Created by branden on 2/1/16.
 */
public class Notebook {

    //set vars
    private double width;
    private double height;
    private String paperType; //college ruled, wide ruled, graph, etc
    private int numberOfPages;


    //set constructors if used
    public Notebook(double width, double height, String paperType, int numberOfPages) {
        setWidth(width);
        setHeight(height);
        setPaperType(paperType);
        setNumberOfPages(numberOfPages);
    }

    /** begin getters and setters **/
    // width
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    // height
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    //paperType
    public String getPaperType() { return paperType; }
    public void setPaperType(String paperType) { this.paperType = paperType; }

    //numberOfPages
    public int getNumberOfPages() { return numberOfPages; }
    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages < 500) {
            this.numberOfPages = numberOfPages;
        } else {
            System.out.println("You entered an absurd amount for number of pages. Try again");
        }
    }
    /** end of getters and setters **/

}
