package LE11;

public class changeCalculator {
    private int cents;

    public changeCalculator(int cents) {
        this.cents = cents;
    }

    public void displayChange() {
        int quarters = this.cents / 25;
        int remaining = this.cents % 25;

        int dimes = remaining / 10;
        remaining = remaining % 10;

        int nickels = remaining / 5;
        int pennies = remaining % 5;

        System.out.println("Your change is");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}