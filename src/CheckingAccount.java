public class CheckingAccount extends Account{

    public CheckingAccount(User client){
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Checking account statement ===");
        super.printInfo();
    }

}