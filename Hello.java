/**********
 * FOR JAVADOC - CREATES A "BOX" AROUND THE COMMENT
 * Class Hello as the introduction for Java programming.
 */

// package intro; -- Appears when you create a package
// import [name_of_package].[class_or_*] -- To import a class or all classes from the package

import java.util.Scanner;

public class Hello {

    /**
     * Main method
     * @param args let you provide arguments for the main
     */
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello again - Java!");

        int age = 18;
        final double pi = 3.141592;
        String name = "Krzysiek";
        char group = 'C';
        boolean student = true;

        name = scan.nextLine();
        System.out.printf("%s rocks! He is %d and is in %c group on AHE (that's %b). And pi = %f.", name, age, group, student, pi);

        name = switch(group) {
            case 'A', 'C' -> "Krzysiek";
            case 'B', 'D' -> "Arleta";
            default -> "Unknown group representant.";
        };

        scan.close();
    }
}
