package baseCourse.classes.class04;

import baseCourse.classes.class05.innerAccess;

public class abstractCEO extends abstractArchitect implements innerAccess {

    private String registeredPassword = "Alpha321";

    @Override
    public double getSalaryBoost(){
        return getArchitectSalary() * 0.16;
    }

    @Override
    public boolean authenticatePassword(String insertedPassword) {
        if(this.registeredPassword.equals(insertedPassword)){
            return true;
        }
        return false;
    }

    /* Attention: Abstract methods can only be created
       inside abstract classes (It can be void, too)
       Abstract method - Example:
         public abstract double getExtraHours(){

         }
    */

}
