import java.rmi.NotBoundException;

/**
 * Created by branden on 2/1/16.
 */
public class Vehicle {

    private String model;
    private int year;
    private int doors;
    private double gasLevel;   //enter as percent
    private boolean isAutomatic = true; //if false, car is a manual.

    //begin constuctors

    public Vehicle(String model, int year, int doors, double gasLevel, boolean isAutomatic) {
        setModel(model);
        setYear(year);
        setDoors(doors);
        setGasLevel(gasLevel);
        setAutomatic(isAutomatic);
    }

    /** begin of getters and setters **/

    //Model
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    //year
    public int getYear() { return year; }
    public void setYear(int year) {
        if (isPositive(year)) {
            this.year = year;
        } else {
            this.year = 1; //this is for testing. This else statement should throw an exception.
        }
    }
    //doors
    public int getDoors() { return doors;  }
    public void setDoors(int doors) { this.doors = doors; }

    //gaslevel
    public double getGasLevel() { return gasLevel; }
    public void setGasLevel(double gasLevel) { this.gasLevel = gasLevel;  }

    //isAutomatic
    public boolean getAutomatic() { return isAutomatic;  }
    public void setAutomatic(boolean automatic) { this.isAutomatic = automatic;  }

    /** end of getters and setters **/

    //Method to check for positive numbers
    public boolean isPositive(int numberToCheck) {
        if (numberToCheck >= 0) {
            return true;
        } else {
            return false; }
    }

    public boolean isPositive(double numberToCheck) {
        if (numberToCheck >= 0) {
            return true;
        } else {
            return false; }
    }


}
