package baseCourse.classes.class03;

public class CEO extends Architect {

    public double getSalaryIncrease(){
        return super.getArchitectSalary() * 0.30;
    }
}
