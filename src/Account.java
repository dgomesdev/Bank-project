public abstract class Account implements ATM{

    private static final int STANDARD_AGENCY = 1;
    private static int SEQUENCE = 1;

    protected int agencyNumber;
    protected int accountNumber;
    protected double balance;
    protected User client;

    public Account(User client){
        this.agencyNumber = Account.STANDARD_AGENCY;
        this.accountNumber = SEQUENCE++;
        this.client = client;
    }

    @Override
    public void withdrawal(double amount) {

    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void transfer(double amount, Account destinationAccount) {
        this.balance -= amount;
        destinationAccount.balance += amount;
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void printInfo(){
        System.out.printf("Owner: %s%n", this.client.getName());
        System.out.printf("Agency number: %d%n", this.agencyNumber);
        System.out.printf("Account number: %d%n", this.accountNumber);
        System.out.printf("Balance: %.2f%n", this.balance);
    }

}