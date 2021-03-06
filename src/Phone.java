/**
 * Created by branden on 2/1/16.
 *
 * Should be instantiated as model number
 */
public class Phone {

    //set up vars
    private double price;
    private String carrier;
    private String brand;
    private int modelYear;
    private boolean isUnlocked; //Bool defaults to false, which is probably the answer to this. Leaving as default.

    //constructors if needed
    public Phone(double price, String carrier, String brand, int modelYear, boolean isUnlocked) {
        setPrice(price);
        setCarrier(carrier);
        setBrand(brand);
        setModelYear(modelYear);
        setUnlocked(isUnlocked);
    }

    /** start of getters and setters **/

    // price
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // carrier
    public String getCarrier() { return carrier;  }
    public void setCarrier(String carrier) {  this.carrier = carrier;   }

    // brand
    public String getBrand() {  return brand;  }
    public void setBrand(String brand) {
        if (brand.length() > 100) {
            this.brand = "There was an error";
        } else {
            this.brand = brand;
        }
    }

    // modeYear
    public int getModelYear() { return modelYear; }
    public void setModelYear(int modelYear) {  this.modelYear = modelYear;  }

    //isUnlocked
    public boolean getIsUnlocked() {  return isUnlocked;  }
    public void setUnlocked(boolean unlocked) { this.isUnlocked = unlocked;  }

    /** end of getters and setters **/
}
