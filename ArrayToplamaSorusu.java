package practices;

import java.util.Scanner;

public class ArrayToplamaSorusu {
    public static void main(String[] args) {


        // Given an array of ints length 3, return the sum of all the element

        //int [] arr= {1, 2, 3}; //→ 6

        int [] userArray=userArrayCreated();


        int sum = 0;

        for (int i = 0; i < userArray.length; i++) {

            sum +=userArray[i];
        }
        System.out.println("Sum of elements of array = " + sum);
    }

    private static int[] userArrayCreated() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the Array you want to create");
        int lengthOfUserArray = scan.nextInt();
        int[] userArray = new int[lengthOfUserArray];

        for (int i = 0; i < userArray.length; i++) {

            System.out.println("Please enter a number for the Array");
            userArray[i] = scan.nextInt();


        }
        return userArray;
    }
}
