package baseCourse.classes.class02;

public class bankAccount {
    private int accountNumber;
    private int accountAgency;
    private double accountBalance;
    private Client accountOwner;

    // 10/05/2021 - * NEW * - Heritage concept
    private static int totalOpenedAccounts;

    // "Constructor" method - Default form
    public bankAccount() {

    }

    // "Constructor" method - Customized form
    public bankAccount(int bankAccountNumber, int bankAccountAgency) {
        this.accountNumber = bankAccountNumber;
        this.accountAgency = bankAccountAgency;
    }

    public bankAccount(int bankAccountNumber, int bankAccountAgency, double bankAccountBalance, Client bankAccountOwner){
        super();
        bankAccount.totalOpenedAccounts++;
        System.out.println("Total opened accounts (Inside constructor method) = " + totalOpenedAccounts);
        this.accountNumber = bankAccountNumber;
        this.accountAgency = bankAccountAgency;
        this.accountBalance = bankAccountBalance;
        this.accountOwner = bankAccountOwner;
    }

    // "Getters" and "setters" methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumberCode) {
        this.accountNumber = accountNumberCode;
    }

    public int getAccountAgency() {
        return accountAgency;
    }

    public void setAccountAgency(int accountAgencyCode) {
        this.accountAgency = accountAgencyCode;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountAvailableQuantity) {
        this.accountBalance = accountAvailableQuantity;
    }
    
    public Client getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(Client accountOwnerName) {
        this.accountOwner = accountOwnerName;
    }

    public static int getTotalOpenedAccounts(){
        return totalOpenedAccounts;
    }

    // "totalOpenedAccounts" setter method was deleted
    // because it became unuseful. We need
    // it incremented automatically, that means it cant
    // be setter by user

    // "Value deposit" method
    public void depositQuantity(double depositValue) {
        this.accountBalance += depositValue;
    }

    // Value withdraw method
    public boolean withdrawQuantity(double withdrawValue) {
        if (this.accountBalance >= withdrawValue) {
            this.accountBalance -= withdrawValue;
            return true;
        }
        return false;
    }

    // Value transference method
    public boolean transferQuantity(double transferValue, bankAccount destinyAccount) {
        if (this.accountBalance >= transferValue) {
            this.accountBalance -= transferValue;
            destinyAccount.depositQuantity(transferValue);
            return true;
        }
        return false;
    }
}
