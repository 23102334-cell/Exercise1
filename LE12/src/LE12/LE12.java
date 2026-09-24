package LE12;

import java.util.Scanner;

public class LE12{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        
        int originalNumber = number;
        int product = 1;
        
        if (number == 0) {
            product = 0;
            System.out.println(0);
        } else {
            while (number > 0) {
                int digit = number % 10;
                System.out.println(digit);
                product *= digit;
                number /= 10;
            }
        }
        
        System.out.println("The product of all digits in " + originalNumber + " is " + product);
        input.close();
    }
}