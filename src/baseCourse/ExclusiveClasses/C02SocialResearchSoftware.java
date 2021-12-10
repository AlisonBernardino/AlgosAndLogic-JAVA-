package baseCourse.ExclusiveClasses;

import java.util.Scanner;

public class C02SocialResearchSoftware {
    public static void main(String[] args){
        Scanner clientInput = new Scanner(System.in);
        int researchedMembers = 0;
        int memberSonsQuantity = 0;
        int totalMembersSons = 0;
        int sonsAverage = 0;
        int salaryCounterFlag = 0;
        float memberSalary = 0;
        float totalSalaryValue = 0;
        float salaryAverage = 0;
        float basicSalaryPercentage = 0;
        float researchedMembersPercentage = 100;

        System.out.println("Hello! This is the S.R.S - Social Research Software - v1.0");
        System.out.println("To start, insert the researched peoples number = ");
        researchedMembers = clientInput.nextInt();

        for(int loopCounter = 1; loopCounter <= researchedMembers;loopCounter++){
            System.out.println("Insert the member " + loopCounter + " salary = ");
            memberSalary = clientInput.nextFloat();
            if(memberSalary <= 100){
                salaryCounterFlag++;
            }
            totalSalaryValue += memberSalary;

            System.out.println("Type the member " + loopCounter + " sons quantity = ");
            memberSonsQuantity = clientInput.nextInt();
            totalMembersSons += memberSonsQuantity;
        }
        // Total salaries sum and average
        System.out.println("Total salary sum = " + totalSalaryValue);
        salaryAverage = totalSalaryValue / researchedMembers;
        System.out.println("Salary average = " + salaryAverage);

        // Total sons sum and average
        System.out.println("Total sons quantity = " + totalMembersSons);
        sonsAverage = totalMembersSons / researchedMembers;
        System.out.println("Sons average = " + sonsAverage);

        // More than R$100,00 salaries percentage analyzer
        if(salaryCounterFlag == researchedMembers)
            System.out.println("Users with R$100,00+ salary percentage = " + researchedMembersPercentage);
        else{
            basicSalaryPercentage = (salaryCounterFlag * 100) / researchedMembers;
            System.out.println("Users with R$100,00+ salary parcentage = " + basicSalaryPercentage + "%");
        }
    }
}
