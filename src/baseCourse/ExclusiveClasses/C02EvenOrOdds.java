package baseCourse.ExclusiveClasses;

import java.util.Scanner;

public class C02EvenOrOdds {
    public static void main(String[] args){
        Scanner userDigit = new Scanner(System.in);

        System.out.println("Welcome to E.O.O. - Even or Odds - v2.0");
        System.out.println("Lets check if your typed number is EVEN or ODD");
        System.out.println("Please, insert a value = ");
        double typedNumber = userDigit.nextFloat();

        if(typedNumber % 2 == 0){
            System.out.println("Your value is an EVEN number.");
            System.out.println("Typed number = " + typedNumber);
            double typedNumberSquareRoot = (Math.sqrt(typedNumber));
            System.out.println(typedNumber + "² = " + typedNumberSquareRoot);
        }else if (typedNumber % 2 == 1){
            System.out.println("Your value is an ODD number.");
            System.out.println("Typed number = " + typedNumber);
            double typedNumberPotency = (Math.pow(typedNumber,2));
        }
        System.out.println("System operation completed successfully!");
    }
}
