package LE13;

import java.util.Scanner;

public class LE13{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        
        System.out.print("Enter age in years: ");
        double age = input.nextDouble();
        
        double bmrWoman = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        double bmrMan = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        
        double caloriesPerBar = 230.0;
        double barsWoman = bmrWoman / caloriesPerBar;
        double barsMan = bmrMan / caloriesPerBar;
        
        System.out.printf("A woman needs to consume %.2f chocolate bars to maintain weight.%n", barsWoman);
        System.out.printf("A man needs to consume %.2f chocolate bars to maintain weight.%n", barsMan);
        
        input.close();
    }
}
