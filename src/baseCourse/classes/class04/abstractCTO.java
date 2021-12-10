package baseCourse.classes.class04;

public class abstractCTO extends abstractArchitect{

    @Override
    public double getSalaryBoost(){
        return getArchitectSalary() * 0.20;
    }
}
