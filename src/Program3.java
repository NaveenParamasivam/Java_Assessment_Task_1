/*
Write down the program to reverse the given number using loops.
Input = 876, Output = 678
*/

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int number = getNumber.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        while (originalNumber != 0) {
            reversedNumber = reversedNumber * 10 + (originalNumber % 10);
            originalNumber /= 10;
        }

        System.out.println("User Entered Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);

        getNumber.close();
    }
}