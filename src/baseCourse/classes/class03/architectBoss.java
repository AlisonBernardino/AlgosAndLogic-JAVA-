package baseCourse.classes.class03;

import java.util.Scanner;

public class architectBoss extends Architect {

    private String bossRegisterCode = "b01Sample";
    private String registeredBossLogin = "b01Login";

    Scanner authenticationInput = new Scanner(System.in);

    // "Register code authenticator" method
    public boolean authenticateBAC(String bossRegisterCodeData) {

        System.out.println(" ");
        System.out.println("======================");
        System.out.println("Prime Bank");
        System.out.println("Boss Authentication Code (B.A.C.) protocol");
        System.out.println("Please, type the B.A.C. to proceed = ");
        String BACInput = authenticationInput.next();

        if (BACInput.equals(bossRegisterCode)) {
            System.out.println("Boss code verified successfully!");

            return true;
        } else {
            return false;
        }
    }

    public boolean authenticateLogin(String bossLoginData){

        System.out.println(" ");
        System.out.println("=================");
        System.out.println("Prime Bank");
        System.out.println("Boss Login Data (B.L.D.) protocol");
        System.out.println("Now, insert the B.L.D. to proceed = ");
        String loginInput = authenticationInput.next();

        if(loginInput.equals(registeredBossLogin)){
            System.out.println("B.L.C. verified successfully!");
            System.out.println("Welcome to PrimeBank!");
            return true;
        }else{
            System.out.println("Error A-03! Invalid login credentials. Please, try again.");
            return false;
        }
    }

    // "codeChange" method
    public boolean changeBAC(String oldRegisteredCode, String newRegisterCode) {
        oldRegisteredCode = bossRegisterCode;

        // oldCodeConfirmation = Variable to receive the old code
        // confirmation before registering a new B.A.C.
        String oldCodeConfirmation = null;

        Scanner dataTyping = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("================");
        System.out.println("Prime Bank");
        System.out.println("Boss Authentication Code (B.A.C.)");
        System.out.println("Do you wish to change the B.A.C.? (Type YES or NO)");
        System.out.println("Your answer = ");
        String BACChangeRequest = dataTyping.next();

        if (BACChangeRequest.equals("YES")) {
            do {
                System.out.println("You need to insert your old B.A.C.");
                System.out.println("Old B.A.C. = ");
                String oldBACCode = dataTyping.next();
                if (oldBACCode.equals(oldRegisteredCode)) {
                    oldCodeConfirmation = oldBACCode;
                    System.out.println("Old B.A.C. confirmed successfully!");
                    System.out.println("Now, insert the new Boss Authentication Code = ");
                    String newBACCode = dataTyping.next();
                    do {
                        if (newBACCode != oldRegisteredCode && newBACCode != null) {
                            System.out.println("New B.A.C. registered successfully!");
                            this.bossRegisterCode = newRegisterCode;
                            return true;
                        } else {
                            System.out.println("Error A02 - Old B.A.C. or null code detected! Please, insert a code you never used before!");
                            System.out.println("Your new B.A.C. = ");
                            newBACCode = dataTyping.next();
                        }
                    } while (newBACCode == oldRegisteredCode);
                } else {
                    System.out.println("Error A-02! Wrong registered code inserted! Please, type your old B.A.C. used before the new code register.");
                }
            } while (oldCodeConfirmation != oldRegisteredCode);
        } else {
            System.out.println("System is shutting down");
        }
        return false;
    }

    // To see the architectBoss salary
    public double seeArchitectSalary(){
        return getArchitectSalary();
    }
}
