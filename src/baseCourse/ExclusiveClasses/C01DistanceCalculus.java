package ToAddToAlgosAndLogic;

import java.util.Scanner;

public class C01DistanceCalculus {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        double XNumber01, XNumber02, YNumber01, YNumber02;
        double valueA, valueB, valueC, valueD;

        System.out.println("Distance calculus");
        System.out.println("Type the X axis value 01 = ");
        XNumber01 = reader.nextDouble();
        System.out.println("Now, insert the X axis value 02 = ");
        XNumber02 = reader.nextDouble();
        System.out.println("One more step: Insert the Y axis value 01 = ");
        YNumber01 = reader.nextDouble();
        System.out.println("To finish, type the Y axis value 02 = ");
        YNumber02 = reader.nextDouble();

        valueA = Math.pow((XNumber02 - XNumber01),2);
        valueB = Math.pow((YNumber02 - YNumber01),2);
        valueC = (valueA + valueB);
        valueD = Math.sqrt(valueC);

        System.out.println("The result is = " + valueD);
        System.out.println("Test line");
    }
}
