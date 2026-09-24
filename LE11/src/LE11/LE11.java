package LE11;

import java.util.Scanner;

public class LE11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount (from 1 - 99 cents): ");
        int amount = scanner.nextInt();

        if (amount >= 1 && amount <= 99) {
            changeCalculator calculator = new changeCalculator(amount);
            calculator.displayChange();
        } else {
            System.out.println("Invalid input. Please enter an amount between 1 and 99.");
        }
        scanner.close();
    }
}