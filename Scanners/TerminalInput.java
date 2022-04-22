// TerminalInput.java
// by Aryan Karani
// 04/20/2022

import java.util.Scanner;

public class TerminalInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // initialize Scanner with System.in, the command line input
        System.out.print("Put number: "); // print out prompt Put Number: 
        if (scan.hasNextInt()) { // if there is an integer in the input
            System.out.println("input: " + scan.nextInt()); // print out the integer
        } else { // if there is not an integer, skip the token and report invalid input.
            scan.next(); 
            System.out.println("Invalid input");
        }
        scan.close(); // close the scanner 
    }
}