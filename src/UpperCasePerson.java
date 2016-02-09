/**
 * Created by branden on 2/9/16 at 11:00.
 */
public class UpperCasePerson extends Person {


    @Override
    public void setName(String name) {
        super.setName(name.toUpperCase());
    }
}