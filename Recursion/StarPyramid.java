// StarPyramid.java
// by Aryan Karani
// 4/19/2022

// Program for recursion video, prints out pyramid patterns of '*' such as below, example with input size 6

/*

*
**
***
****
*****
******

*/

// for upside down pyramid

/*

******
*****
****
***
**
*

*/

// CHALLENGE: backwards upright pyramid

/*

     *
    **
   ***
  ****
 *****
******

*/


public class StarPyramid {
    
    public static void main(String[] args) {
        printPyramid(6);
        System.out.println();
        printUpsideDownPyramid(6);
    }

    public static void printPyramid(int size) { // prints first example shown above

        if (size == 0) { // base case
            return;
        }

        printPyramid(size-1);
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

    public static void printUpsideDownPyramid(int size) { // prints second example shown above
        if (size == 0) { // base case
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();
        printUpsideDownPyramid(size-1);
    }








    public static void printBackwardsPyramid(int size, int row) { // challenge answer 
        if (row < 0) {
            return;
        }

        printBackwardsPyramid(size, row-1); // recursive call
        for (int i = 0; i < size-row; i++) { // print spaces
            System.out.print(" ");
        }
        for (int j = 0; j < row; j++) { // print stars
            System.out.print("*");
        }
        System.out.println();
    }


}
