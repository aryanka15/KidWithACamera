// RecursionWithReturn.java
// by Aryan Karani
// Period 2
// 04/19/2022

/* 

Code to solve the bunnyEars2 prompt from codingbat 

We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies 
(2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny 
line 1, 2, ... n (without loops or multiplication).

*/

public class RecursionWithReturn {
    public static void main(String[] args) {
        System.out.println(bunnyEars2(10));
    }

    public static int bunnyEars2(int bunnies) { // Prompt at https://codingbat.com/prob/p107330
        if (bunnies == 0) {
            return 0;
        }
        else if (bunnies%2 == 0) {
            return 3 + bunnyEars2(bunnies-1);
        }
        return 2 + bunnyEars2(bunnies - 1);
    }
}