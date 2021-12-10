package baseCourse.ExclusiveClasses;

import java.util.Scanner;

public class C02BigInputSum {
    public static void main(String[] args){
        Scanner sumInput = new Scanner(System.in);
        float totalSum = 0;

        System.out.println("Welcome to I.S. - Input Sum v2.0");
        System.out.println("To start, insert the loop size = ");
        int loopSize = sumInput.nextInt();
        for(int currentLoop = 1; currentLoop <= loopSize;currentLoop++) {
            System.out.println("Type the number " + currentLoop + "/" + loopSize + " = ");
            float userInsertion = sumInput.nextFloat();
            totalSum += userInsertion;
        }
        System.out.println("Insertions quantity = " + loopSize);
        System.out.println("Total sum = " + totalSum);
    }
}
