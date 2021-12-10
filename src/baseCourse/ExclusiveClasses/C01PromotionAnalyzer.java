package ToAddToAlgosAndLogic;

import java.util.Scanner;

public class C01PromotionAnalyzer {
    public static void main(String[] args){
        Scanner dataInput = new Scanner(System.in);

        String professionalOccupation;
        float baseSalary;
        int workMonths;

        System.out.println("====================");
        System.out.println("Salary Analyzer v1.5");
        System.out.println("Please, insert the professional occupation = ");
        professionalOccupation = dataInput.next();
        System.out.println("Now, type the base salary = ");
        baseSalary = dataInput.nextFloat();
        System.out.println("To finish, insert the working months = ");
        workMonths = dataInput.nextInt();

        if(professionalOccupation != null && baseSalary > 500 && workMonths > 6){
            System.out.println("Congratulations! You won a salary boost.");
            System.out.println("Salary boost value = US$250");
            baseSalary += 250;
            System.out.println("New salary = " + baseSalary);
        }else{
            System.out.println("Sorry! We have detected an issue.");
            System.out.println("Please, check the following fields = ");
            System.out.println("Professional occupation (It cant be NULL)");
            System.out.println("Base salary (It should be larger than US$500,00");
            System.out.println("Working months (You need to have 6+ months of work");
        }
    }
}
