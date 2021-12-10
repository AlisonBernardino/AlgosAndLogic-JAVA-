package baseCourse.classes.class04;

// 08/10/2021 - * NEW * - Abstraction concept
// Abstract classes should never be instantiated
// (In the end, it can't be instantiated at all)

public class abstractArchitect {
    private String architectName;
    private double architectSalary;
    private int architectModality;

    public abstractArchitect(){
        super();
    }

    public abstractArchitect(String workerName, double workerSalary, int workerModality){
        this.architectName = workerName;
        this.architectSalary = workerSalary;
        this.architectModality = workerModality;
    }

    public double getSalaryBoost(){
        architectSalary += architectSalary * 0.15;
        return this.architectSalary;
    }

    public String getArchitectName(){
        return architectName;
    }

    public void setArchitectName(String memberName){
        this.architectName = memberName;
    }

    public double getArchitectSalary(){
        return architectSalary;
    }

    public void setArchitectSalary(double memberSalary){
        this.architectSalary = memberSalary;
    }

    public int getArchitectModality(){
        return architectModality;
    }

    public void setArchitectSalary(int memberModality){
        this.architectModality = memberModality;
    }
}
