/**
 * Created by branden on 2/1/16.
 */
public class Television {

    public int size; // in inches
    public String model;
    public String brand;
    public boolean isRefurbished; //Bool defaults to false!
    public boolean isSmart; //Is TV a "smart" TV?
    public double price;

    // Constructors if used
    public Television(int size, String model, String brand, boolean isRefurbished, boolean isSmart, double price) {
        setSize(size);
        setModel(model);
        setBrand(brand);
        setRefurbished(isRefurbished);
        setSmart(isSmart);
        setPrice(price);
    }


    /** Begin of getters and setters */

    // size
    public int getSize() {  return size;  }
    public void setSize(int size) { this.size = size;  }

    // model
    public String getModel() {  return model;  }
    public void setModel(String model) {  this.model = model;  }

    // brand
    public String getBrand() { return brand;  }
    public void setBrand(String brand) { this.brand = brand;  }

    // isRefurbished
    public boolean getIsRefurbished() { return isRefurbished;  }
    public void setRefurbished(boolean refurbished) { this.isRefurbished = refurbished;  }

    // isSmart
    public boolean isSmart() { return isSmart;  }
    public void setSmart(boolean smart) {  isSmart = smart;  }

    // price
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price;  }

    /** End of getters and setters */
}
