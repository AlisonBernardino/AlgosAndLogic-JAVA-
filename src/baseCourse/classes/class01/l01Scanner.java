package baseCourse.classes.class01;

import java.util.Scanner;

public class l01Scanner {
    public static void main(String[] args){
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Welcome to TechUnivesity");

        // Text type scanner
        System.out.println("Please, insert the desired formation title = ");
        String insertedFormation = scanInput.next();

        // Integer type scanner
        System.out.println("Now, insert the desired periods = ");
        int insertedPeriods = scanInput.nextInt();

        // Double type scanner
        System.out.println("To finish, insert the final average = ");
        double insertedAverage = scanInput.nextDouble();

        System.out.println("=============");
        System.out.println("Formation details = ");
        System.out.println("Title = " + insertedFormation);
        System.out.println("Periods = " + insertedPeriods);
        System.out.println("Average = " + insertedAverage);
    }
}
