package baseCourse.classes.class02;

public class bankAccountMain {
    public static void main(String[] args){
        Client client01 = new Client("Carlos","Olivera",28111,"Military");
        Client client02 = new Client("Jill","Valentine",27232,"Cop");

        bankAccount accountA = new bankAccount();

        /*
          Old code [Next line] (Without encapsulation)
          accountA.accountNumber = 357;
          accountA.accountOwner = "Barry Burton";
        */
        
        accountA.setAccountNumber(9977);
        accountA.setAccountOwner(client01);

        // Constructor method obligatorily - 02 items
        bankAccount accountB = new bankAccount(2222,1111);

        // Constructor method obligatorily - All items
        bankAccount accountC = new bankAccount(1994, 2111,650,client01);

        accountC.depositQuantity(250.0);

        // Old code [Next line] (Without encapsulation method call)
        // System.out.println(accountC.accountBalance);
        System.out.println(accountC.getAccountBalance());

        bankAccount accountD = new bankAccount(8888, 4444, 250.0, client02);

        // To withdraw a value
        if(accountC.withdrawQuantity(550.0)){
            System.out.println("Withdraw completed successfully!");
        }else{
            System.out.println("Error! Impossible to withdraw value. Please, re-check this information and try again.");
        }

        // To transfer a value from "accountC" to "accountA"
        accountC.transferQuantity(100, accountA);

        System.out.println(" ");
        System.out.println("==== Bank operation status ====");
        System.out.println("Destiny account = ");
        System.out.println("Account = " + accountA.getAccountNumber());
        System.out.println("Owner = " + accountA.getAccountOwner().getClientFirstName());
        System.out.println("Balance = " + accountA.getAccountBalance());
        System.out.println("Origin account = ");
        System.out.println("Account = " + accountC.getAccountNumber());
        System.out.println("Owner = " + accountC.getAccountOwner().getClientFirstName());
        System.out.println("Balance = " + accountC.getAccountBalance());

        // To see the total opened accounts with the PrimeBank system
        System.out.println(" ");
        System.out.println("Total opened accounts = ");
        System.out.println(accountD.getTotalOpenedAccounts());
    }
}
