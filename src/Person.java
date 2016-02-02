/**
 * Created by branden on 2/1/16.
 */
public class Person {

    private String name;
    private int age;
    private boolean isAlive = true;
    private String address;

    //standard constructor
    public Person() { }

    //constructor taking name, age, and isalive args
    public Person(String name, int age, boolean isAlive) {
        setName(name);
        setAge(age);
        setAlive(isAlive);
    }

    //constructor calling another constructor
    public Person(String name, int age) {
        this(name, age, true);
    }

    //begin getters and setters
    public String getName() {return name; }

    public void setName(String name) {
        if (isValidName(name)) {
            this.name = name;
        }
    }

    public int getAge() {  return age;   }

    public void setAge(int age ) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public boolean getAlive() {  return isAlive;  }

    public void setAlive(boolean isAlive) {   this.isAlive = isAlive;   }

    public String getAddress() {  return address;   }

    public void setAddress(String address) {  this.address = address;  }


    public boolean isValidName(String name) {
        return name.contains(" ");
        }

    }



