public class ATMInterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", 1000.00);
        User user = new User("John Doe", account);
        ATM atm = new ATM(user);

        atm.handleUserInput();
    }
}
