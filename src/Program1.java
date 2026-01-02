//Write a program to print the numbers from 10 to 50 using for loop/while loop.

public class Program1 {
    public static void main(String[] args) {
        // Using while loop
        System.out.println("Using While Loop:");
        int number = 10;
        while (number <= 50) {
            System.out.println(number);
            number++;
        }

        // Using for loop
        System.out.println("\nUsing For Loop:");
        for (int i = 10; i <= 50; i++) {
            System.out.println(i);
        }
    }
}