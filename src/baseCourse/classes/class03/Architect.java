package baseCourse.classes.class03;

import java.util.Scanner;

public class Architect {
    // Final value = No changes, "getters" or "setters" after the "final" definition
    private final double salaryIncreaseIndex = 0.06;
    private String architectFirstName;
    private String architectRegisterCode;
    private double architectSalary;
    private String architectModality;
    // Modalities =
    // Alpha = Chief architect
    // Beta = 2nd chief architect
    // Standard = Common architect

    public Architect(){

    }

    public Architect(String proMemberFirstName, String proMemberRegisterCode, double proMemberSalary){
        super();
        this.architectFirstName = proMemberFirstName;
        this.architectRegisterCode = proMemberRegisterCode;
        this.architectSalary = proMemberSalary;
    }

    // Salary boosts from "salaryBoost" method =
    // >> Common architect = 15% added to salary + US$850,00
    // >> Beta architect = 20% added to salary + US$1150,00
    // >> Alpha architect = 25% added to salary + US$1450,00

    public double getSalaryBoost(){
        Scanner dataInsertion = new Scanner(System.in);

        System.out.println("Insert the architect modality = ");
        String modalityInput = dataInsertion.next();

        if(modalityInput == "Standard"){
            return this.architectSalary += (architectSalary * salaryIncreaseIndex) + 850.0;
        }else if(modalityInput == "Beta"){
            return this.architectSalary += (architectSalary * salaryIncreaseIndex) + 1150.0;
        }else if(modalityInput == "Alpha"){
            return this.architectSalary += (architectSalary * salaryIncreaseIndex) + 1450.0;
        }else{
            System.out.println("Error! It was not possible to identify the Architect modality. Please, try again!");
            return 0;
        }
    }

    // "Permanent salary increase" method
    public double salaryIncrease(){
        return this.architectSalary += (architectSalary * 0.13);
    }

    public String getArchitectFirstName() {
        return architectFirstName;
    }

    public void setArchitectFirstName(String architectFirstName) {
        this.architectFirstName = architectFirstName;
    }

    public String getArchitectRegisterCode() {
        return architectRegisterCode;
    }

    public void setArchitectRegisterCode(String architectRegisterCode) {
        this.architectRegisterCode = architectRegisterCode;
    }

    public double getArchitectSalary() {
        // To return the architect salary + salary boost
        return architectSalary + getSalaryBoost();
    }

    public void setArchitectSalary(double architectSalary) {
        this.architectSalary = architectSalary;
    }

    public String getModality() {
        return architectModality;
    }

    public void setModality(String architectModality) {
        this.architectModality = architectModality;
    }
}
