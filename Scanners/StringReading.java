// StringReading.java
// by Aryan Karani
// 04/22/2022

import java.util.Scanner;

public class StringReading {
    public static void main(String[] args) {
        String str = "This video is about Scanners\nHello World";

        Scanner scan = new Scanner(str); // Create scanner using string
        
        while (scan.hasNextLine()) { // while there are more lines in the string
            String tempLine = scan.nextLine(); // get the current line of the string
            Scanner stringScan = new Scanner(tempLine); // create scanner using the line
            while (stringScan.hasNext()) { // go through the tokens of the line
                System.out.println(stringScan.next()); // get the next token and print it 
            }
            stringScan.close(); // close the scanner
        }
        scan.close(); // close the scanner
    }
}