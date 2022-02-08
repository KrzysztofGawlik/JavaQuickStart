import java.io.File;
import java.util.Formatter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
    public static void main(String[] args){

        File file = new File("./src_files/first_source.txt");

        if(file.exists()) System.out.println("Found " + file.getName() + " file!");
        else System.out.println("File not found!");

        // File will be created if not exists, if yes the file will be overwritten
        try {
            Formatter ft = new Formatter("./src_files/second_source.txt");
            ft.format("%d. %s %s\n", 1, "Krzysztof", "Gawlik");
            ft.format("%d. %s %s\n", 2, "Gawlik", "Krzysztof");
            ft.close();
        } catch (Exception e) {
            System.out.println("Error: could not create a file/ overwrite file.");
        }

        // Read from file - Scanner behaves like Iterator
        try {
            File file_2 = new File("./src_files/second_source.txt");
            Scanner scan = new Scanner(file_2);
            while(scan.hasNextLine()) System.out.println(scan.nextLine());
            scan.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("Error: file do not exists.");
        }

    }
}
