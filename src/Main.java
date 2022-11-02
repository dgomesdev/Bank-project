public class Main {
    public static void main(String[] args) {

        User danilo = new User();
        danilo.setName("Danilo");

        Account checking = new CheckingAccount(danilo);
        Account savings = new SavingsAccount(danilo);

        checking.deposit(100);
        checking.transfer(100, savings);

        checking.printStatement();
        savings.printStatement();

    }
}