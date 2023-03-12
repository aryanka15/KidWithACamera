import java.util.Arrays;

// ArrayBasics.java
// by Aryan Karani
// Period 2
// 04/29/2022

public class ArrayBasics {
    public static void main(String[] args) {
        
        int[] integers = new int[10]; // Integer array, fills array with 0's for empty array
        String[] strings = new String[]{"Hello", "Hello2", "Hello3"}; // String array with initialized values, if it was 
                                                                      // initialized empty, then the array would be filled with null, 
                                                                      // which is the default for all objects. 

        int x = integers[2]; // accesses element at index 2 in integers array
        System.out.println(x);
        System.out.println(Arrays.toString(strings)); // prints out array with format [element1, element2, element3...]
        strings[0] = "Hello1"; // changes element at index 0
        System.out.println(Arrays.toString(strings));
        int length = strings.length; // length of array
        
    }
}