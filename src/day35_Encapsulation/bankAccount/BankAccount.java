package day35_Encapsulation.bankAccount;

public class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /*
    did not generate setter for balance, because balance should only be set when deposit() & withdraw()
    methods are being executed
     */

    public void deposit(double amount){

        if (amount<=0){
            System.err.println("Depositing amount can not be zero or negative");
            System.exit(1);
        }

        System.out.println("Deposting $"+amount+" to the account "+ accountNumber);
        balance+=amount;

    }

    public void withdraw(double amount){

        if (amount<=0){
            System.err.println("Withdrawing amount can not be zero or negative");
            System.exit(1);
        }

        if (balance<amount){
            System.err.println("Insufficient balance");
            System.exit(1);
        }

        System.out.println("Withdrawing $"+amount+" to the account "+accountNumber);
        balance-=amount;

    }
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }

}
/*
3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkBalance()
                toString()

            DO NOT duplicate any code fragments
 */