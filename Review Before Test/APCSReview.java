import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class APCSReview {

    public static void main(String[] args) {

        int x = 0;
        String str = "Hello, World";
        double y = 0.0;
        long long1 = 14;
        float float1 = 14;

        ArrayList<String> strs = new ArrayList<>();
        System.out.println(strs.toString());
        strs.add("Hello");
        strs.add("Oh no!");
        strs.remove(1);
        System.out.println(strs.toString());
        System.out.println(strs.get(0));
        strs.add("Hello2");
        strs.add("hello3");
        strs.add("hello4");
        System.out.println(strs.remove(2));
        System.out.println(strs.set(1, "helloprank"));
        strs.add(3, "Hello");
        System.out.println(strs.toString());

        int[] arr2 = new int[10];
        int[] arr3 = new int[]{1, 2, 3,4 ,5, 6};
        for (int i: arr2) {
            System.out.println(i);
        }
        for (int i: arr3) {
            System.out.println(i);
        }

        int[][] twoDArray = new int[10][5];
        int[][] jaggedArray = new int[10][];
        jaggedArray[0] = new int[]{1, 2, 3};
        jaggedArray[1] = new int[]{1, 2, 3, 4};
        System.out.println("TWODARRAY");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.println(twoDArray[i][j]);
            }
        }

        Random gen = new Random();
        int rand = gen.nextInt(10);
        rand = gen.nextInt(7) + 5;  // range of 5 to 11
        // to get a range using Random() your bound is (max - min) + 1 and add min to the result

        int random = (int) Math.random()*6; //(gives 0-5) generates number from 0.0 -> any double less than 1; 0.9*4 = 4.5 -> 4 as int 4 + 1 = 5 to get 1-5 range
        random = (int) Math.random()*7 + 5;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string");
        String scanResult = scan.next();
        System.out.println(scanResult+10);

        FirstObject obj = new FirstObject(5, 2);
        obj.changeY(5);
        System.out.println("Y: " + obj.getY());
        InhertianceObject obj2 = new InhertianceObject(4, 2);
        obj2.changeX(3);
        obj2.changeY(2);
        System.out.println("X: " + obj.getX());

        FirstObject arr = new InhertianceObject(2, 3);
        arr.changeY(500);
    }

    private static int makeInt(int x) {
        return 0;
    }


}