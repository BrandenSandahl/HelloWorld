

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
            this.year = -1;
            System.out.println("There was an error with the year you entered. Please try again");  //this is not a good way to handle this, but at least it gives some feedback
        }
    }

    //doors
    public int getDoors() { return doors;  }
    public void setDoors(int doors) {
        if (isPositive(doors)) {
            this.doors = doors;
        } else {
            this.doors = -1;
            System.out.println("There was an error with the doors you entered. Please try again"); //again, bad way to handle this
        }
    }

    //gaslevel
    public double getGasLevel() { return gasLevel; }
    public void setGasLevel(double gasLevel) {
        if (isPositive(gasLevel)) {
            this.gasLevel = gasLevel;
        } else {
            this.gasLevel = -1;
            System.out.println("There was an error with the gas level. Please try again"); //bad
        }
    }

    //isAutomatic
    public boolean getAutomatic() { return isAutomatic;  }
    public void setAutomatic(boolean automatic) {
        if (isAutomatic != true && isAutomatic != false) {
            System.out.println("You entered an invalid value. Valid values are true or false. Thanks");   //not really possible to trigger this because java would throw an error anyway
        } else {
            this.isAutomatic = automatic;
        }
    }

    /** end of getters and setters **/

    //Method to check for positive numbers, including 0
    public boolean isPositive(int numberToCheck) {
        if (numberToCheck >= 0) {
            return true;
        } else {
            return false; }
    }
    //overloading on double
    public boolean isPositive(double numberToCheck) {
        if (numberToCheck >= 0) {
            return true;
        } else {
            return false; }
    }


}
