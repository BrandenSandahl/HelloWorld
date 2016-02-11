import jdk.nashorn.internal.parser.JSONParser;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by branden on 2/10/16 at 10:39.
 */
public class ReadWriteJSON {

    public static void main(String[] args) throws IOException {

        Person p = new Person("Alice Smith", 25);
        File f = new File("person.json");   //create a new file

        //Write JSON
        JsonSerializer serializer = new JsonSerializer();  //create a new object of serializer
        String json = serializer.serialize(p);  //serialize the object into a string
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();


        //read JSON
        Scanner s = new Scanner(f);  //scanner from our file
        s.useDelimiter("\\Z");  //delimiter to read until end of file
        String contents = s.next();  //next to pull until delimiter
        JsonParser parser = new JsonParser();  //parser to convert from JSON to object
        Person p2 = parser.parse(contents, Person.class); //create a new object with info.


        System.out.println(p2);



    }

}