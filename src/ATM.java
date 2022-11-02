public interface ATM {

    void withdrawal(double amount);
    void deposit(double amount);
    void transfer(double amount, Account destinationAccount);
    void printStatement();

    }
