package baseCourse.classes.class04;

import baseCourse.classes.class05.innerAccess;

public abstract class abstractCustomer implements innerAccess {
    private int customerID;
    private String customerName;
    private String teamName;
    private double customerCredits;
    private static int specificTotal;

    public abstract boolean withdrawCredits(double withdrawValue);


}
