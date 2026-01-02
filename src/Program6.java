/*
Write a java program to print bellowed pattern ->i and j and k=>5
5 5 5 5 5
5 4 4 4 4
5 4 3 3 3
5 4 3 2 2
5 4 3 2 1
*/

import java.util.Scanner;

public class Program6 {
    public static void main(String args[]) {
        Scanner getNumber = new Scanner(System.in);
        System.out.println("Enter your number:");
        int k = getNumber.nextInt();

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (j < i) {
                    System.out.print((k - j) + " ");
                } else {
                    System.out.print((k - i) + " ");
                }
            }
            System.out.println();
        }

        getNumber.close();
    }
}