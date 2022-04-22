import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// FileReading.java
// by Aryan Karani
// Period 2
// 04/21/2022

public class FileReading {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/aryankarani/Documents/GitHub/KidWithACamera/Scanners/Words"); // File Object Constructor with Path to file 
        if (file.exists()) { // checks if the file exists at the path

            Scanner fileReader = new Scanner(file); // construct scanner using file object

            while (fileReader.hasNextLine()) { // go through each line of the file
                String str = fileReader.nextLine(); // the current line that the scanner is on
                Scanner scan = new Scanner(str); // construct scanner from string line
                while (scan.hasNext()) { // while there is another token
                    if (scan.hasNextInt()) { // if the next token is an integer
                        System.out.println(scan.nextInt());
                    }
                    else { // if there isn't an integer, skip the token
                        scan.next();
                    }
                }
                scan.close(); // close the scanner
            }

            fileReader.close(); // close the scanner

        }
    }
}