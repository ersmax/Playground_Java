/*
This program demonstrates the use of
File Input Stream class to read from a file
 */

package chapter2.Section2_Input_File_Scanner;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex_2_0_5_Read_File {
    public static void main(String[] args) {
        // The actual path can change,
        // depending on the working directory
        String path = "src/chapter2/Section2_Input_Scanner/Ex_2_0_5_player.txt";
        Scanner fileIn = null;  // initialize fileIn to empty
        try {
            // attempt to open the file
            fileIn = new Scanner(new FileInputStream(path));
        } catch (FileNotFoundException e)
        {
            // execute if file not found
            System.out.println("File not found");
            System.exit(0);
        }

        // If file is opened, handling it
        int highScore;
        String name;
        System.out.println("Text left to read? " + fileIn.hasNextLine());
        highScore = fileIn.nextInt();

        String dummy = fileIn.nextLine();   // Skip the return character
        name = fileIn.nextLine();           // Read full name

        System.out.println("Name: " + name);
        System.out.println("High score: " + highScore);
        System.out.println("Text left to read? " + fileIn.hasNextLine());

        fileIn.close();
    }
}
