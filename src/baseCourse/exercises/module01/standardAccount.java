package baseCourse.exercises.module01;

// Games system account (Steam similar)
public class standardAccount extends Account{
    private double currentCredits;
    private boolean isActivated;

    public standardAccount(double currentCredits, boolean isActivated) {
        this.currentCredits = currentCredits;
        this.isActivated = isActivated;
    }

    //@Override
    public boolean withdrawCredits(double withdrawValue){
        return false;
    }

    //@Override
    public boolean transferCredits(double transferValue,
                                   double destinyAccount){
        return false;
    }

    public double getCurrentCredits() {
        return currentCredits;
    }

    public void setCurrentCredits(double currentCredits) {
        this.currentCredits = currentCredits;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}
