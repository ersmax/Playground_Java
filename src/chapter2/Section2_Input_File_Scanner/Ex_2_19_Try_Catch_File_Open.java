/*
What is missing from the following code, which attempts to open a file and
read an integer?
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ReadInteger
{
public static void main(String[] args)
{
Scanner fileIn = new Scanner(
new FileInputStream("datafile.txt"));
int num = fileIn.nextInt();
System.out.println(num);
}
}
 */

// Missing the try/catch in order to handle the
// error in file opening.


package chapter2.Section2_Input_File_Scanner;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex_2_19_Try_Catch_File_Open {
    public static void main(String[] args)
    {
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new FileInputStream("datafile.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }
        int num = fileIn.nextInt();
        System.out.println(num);
    }
}
