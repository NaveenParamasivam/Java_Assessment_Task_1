/*
Write a program that find a given number is negative or positive.
  Input=123, Output=Positive
  Input=-100, Output=Negative
*/

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int number = getNumber.nextInt();

        if (number > 0) {
            System.out.printf("The Given Number %d Is Positive.%n", number);
        } else if (number == 0) {
            System.out.printf("The Given Number %d Is Neither Positive Nor Negative.%n", number);
        } else {
            System.out.printf("The Given Number %d Is Negative.%n", number);
        }

        getNumber.close();
    }
}