import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        User client = new User();
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Welcome back " + name + "!");
        client.setName(name);

        Account checking = new CheckingAccount(client);
        Account savings = new SavingsAccount(client);

        checking.deposit(150);
        checking.transfer(100, savings);

        checking.printStatement();
        savings.printStatement();

    }
}