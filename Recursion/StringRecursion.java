// StringRecursion.java
// by Aryan Karani
// 04/19/2022

public class StringRecursion {
    public static void main(String[] args) {
        reverseString("Hello");
    }

    public static void reverseString(String str) { // Prints out the reverse of a string and then the string in correct order ex. Hello -> olleHHello using recursion
        if (str.length() == 0) {
            return;
        }

        System.out.print(str.charAt(str.length() - 1));
        reverseString(str.substring(0, str.length() - 1));
        System.out.print(str.charAt(str.length() - 1));
    } 



}