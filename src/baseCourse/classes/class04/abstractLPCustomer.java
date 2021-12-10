package baseCourse.classes.class04;

public class abstractLPCustomer extends abstractCustomer{

    private double accessHours;

    @Override
    public boolean withdrawCredits(double withdrawValue){
        return false;
    }

    @Override
    public boolean authenticatePassword(String insertedPassword) {
        return false;
    }
}
