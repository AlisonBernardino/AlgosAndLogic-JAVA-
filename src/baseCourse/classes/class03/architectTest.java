package baseCourse.classes.class03;

import java.util.Scanner;

public class architectTest {
    public static void main(String[] args){
        Architect proMember01 = new Architect("Washington","000.000.000-00",3600.0);
        System.out.println("Architect 01 salary = " + proMember01.getSalaryBoost());

        // To test a new architectBoss
        architectBoss bossA1 = new architectBoss();
        bossA1.setArchitectFirstName("Jason");
        bossA1.setArchitectSalary(6500.0);

        if(bossA1.authenticateBAC("b01Sample")){
            System.out.println("Code authorized! Welcome, " + bossA1.getArchitectFirstName());
        }else{
            System.out.println("Wrong architect boss code inserted! Please, re-type this information.");
        }
        bossA1.changeBAC("b02Sample","");
        bossA1.authenticateLogin("b01Login");

        // To print the total boss 01 salary boost
        System.out.println(" ");
        System.out.println("===================");
        System.out.println("Prime Bank");
        System.out.println("Boss salaries section");
        System.out.println("===================");
        System.out.println(bossA1.getArchitectFirstName() + " - Salary boost = " + bossA1.getSalaryBoost());

        // To print the total boss 01 salary
        System.out.println(bossA1.getArchitectFirstName() + " - Total salary = " + bossA1.getArchitectSalary());

        CEO CEOMemberA = new CEO();
        CEOMemberA.setArchitectSalary(16400);
        System.out.println("CEO Member A salary = ");
        System.out.println(CEOMemberA.getSalaryIncrease());
    }
}
