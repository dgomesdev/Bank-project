public class SavingsAccount extends Account{

    public SavingsAccount(User client){
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Savings account statement ===");
        super.printInfo();
    }
}