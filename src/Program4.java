//Write a java program to Find the smallest number among three numbers.

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);

        System.out.println("Enter Your First Number:");
        int firstNumber = getNumber.nextInt();
        System.out.println("Enter Your Second Number:");
        int secondNumber = getNumber.nextInt();
        System.out.println("Enter Your Third Number:");
        int thirdNumber = getNumber.nextInt();

        System.out.println("User Entered Numbers: " + firstNumber + ", " + secondNumber + ", " + thirdNumber + ".");

        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            System.out.println("The Smallest Number Is First Number: " + firstNumber);
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            System.out.println("The Smallest Number Is Second Number: " + secondNumber);
        } else {
            System.out.println("The Smallest Number Is Third Number: " + thirdNumber);
        }

        getNumber.close();
    }
}