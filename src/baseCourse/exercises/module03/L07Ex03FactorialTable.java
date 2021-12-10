package baseCourse.exercises.module03;

import java.util.Scanner;

public class L07Ex03FactorialTable {
    Scanner userNumber = new Scanner(System.in);

    public void buildFactorialTable() {
        int loopCounter;
        System.out.println("============================");
        System.out.println("=== Factorial table v1.0 ===");
        System.out.println("To start, type your desired insertions quantity = ");
        int arraySize = userNumber.nextInt();
        float[] userValues = new float[arraySize];

        // To receive the values by the user
        for (loopCounter = 0; loopCounter < userValues.length; loopCounter++) {
            loopCounter++;
            System.out.println("Now, insert the number " + loopCounter);
            loopCounter--;
            userValues[loopCounter] = userNumber.nextFloat();
        }

        // To print the "userValues" array data
        System.out.println("| Inputs |");
        System.out.println("========================================");
        for (loopCounter = 0; loopCounter < userValues.length; loopCounter++) {
            System.out.print("| " + userValues[loopCounter] + "  |");
        }

        // To print the "userValues" array data factorials
        System.out.println(" ");
        System.out.println("========================================");
        System.out.println("| Factorials |");
        System.out.println("========================================");
        float factorialMultiplier = 0;
        for (int loopCounterA = 0; loopCounterA < userValues.length; loopCounterA++) {
            factorialMultiplier = userValues[loopCounterA];
            factorialMultiplier--;
            //System.out.println("Current index = " + loopCounterA);
            while (factorialMultiplier >= 1) {
                userValues[loopCounterA] = userValues[loopCounterA] * factorialMultiplier;
                //System.out.println("==============================");
                //System.out.println("Current multiplier = " + factorialMultiplier);
                //System.out.println("Current user input = " + userValues[loopCounterA]);
                factorialMultiplier--;
            }
            System.out.print("| " + userValues[loopCounterA] + "  |");
        }
    }

    public static void main(String[] args){
        L07Ex03FactorialTable calculusOperations = new L07Ex03FactorialTable();

        calculusOperations.buildFactorialTable();
    }
}
