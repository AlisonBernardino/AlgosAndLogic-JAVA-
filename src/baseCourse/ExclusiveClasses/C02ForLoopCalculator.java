package baseCourse.ExclusiveClasses;

import java.util.Scanner;

public class C02ForLoopCalculator {
    public static void main(String[] args){
        Scanner userValue = new Scanner(System.in);

        float insertedValue, largestValue = 0, totalValue = 0, average;

        for(int counter = 1; counter <= 4; counter++){
            System.out.println("Please, type a number = ");
            insertedValue = userValue.nextFloat();
            if(insertedValue > largestValue){
                largestValue = insertedValue;
            }
            totalValue += insertedValue;
        }
        average = totalValue / 4;

        System.out.println("The largest typed value was the " + largestValue + " number.");
        System.out.println("Final average = " + average);
        System.out.println("Total sum = " + totalValue);
    }
}
