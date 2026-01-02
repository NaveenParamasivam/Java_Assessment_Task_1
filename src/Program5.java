/*Write a Java program that takes the purchase amount as input and calculates the final payable amount after applying the discount.
 1.If the purchase amount is less than 500, no discount is applied.
 2.If the purchase amount is between 500 and 1000, a 10% discount is applied.
 3.If the purchase amount is greater than 1000 a 20% discount is applied.
*/

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        System.out.println("Enter Purchase Amount:");
        double purchaseAmount = getNumber.nextDouble();

        double discountRate = 0;

        if (purchaseAmount < 500) {
            System.out.println("Purchase amount is below 500; no discount applicable.");
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            System.out.println("Purchase is between 500 and 1000; 10% discount applied.");
            discountRate = 0.10;
        } else {
            System.out.println("Purchase is above 1000; 20% discount applied.");
            discountRate = 0.20;
        }

        double discountAmount = purchaseAmount * discountRate;
        double finalAmount = purchaseAmount - discountAmount;

        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Payable Amount: " + finalAmount);

        getNumber.close();
    }
}