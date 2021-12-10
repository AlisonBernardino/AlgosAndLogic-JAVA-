package baseCourse.exercises.module03;

import java.util.Scanner;

public class L07Ex02Factorial {
    Scanner valueInput = new Scanner(System.in);

    public void calculateFactorial(){
        System.out.println("=====================");
        System.out.println("Factorial calculator v1.0");
        System.out.println("To start, insert the value = ");
        float userValue = valueInput.nextFloat();
        float multiplier = 0;
        multiplier = userValue;
        multiplier--;

        while(multiplier >= 1){
            userValue = userValue * multiplier;
            System.out.println("=====================");
            System.out.println("Current multiplier = " + multiplier);
            System.out.println("Current user value = " + userValue);
            multiplier--;
            userValue++;
        };
    }

    public static void main(String[] args){
        L07Ex02Factorial mathOperation01 = new L07Ex02Factorial();

        mathOperation01.calculateFactorial();
    }
}
