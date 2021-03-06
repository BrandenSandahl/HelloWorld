import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by branden on 2/10/16 at 09:54.
 */
public class ReadWriteFile {

    public static void main(String[] args) throws IOException {

        File f = new File("names.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("Alice\n");  //overwrites entire file.
        fw.append("Bob\n");
        fw.append("Charlie\n");
        fw.close();


        Scanner scanner = new Scanner(f);

        //read line by line
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());

        }


        //read entire file
        scanner = new Scanner(f);
        scanner.useDelimiter("\\Z");
        String contents = scanner.next();
        System.out.println(contents);


    }


}