import java.util.Scanner;

public class AccountTerminal {

    private int number;
    private String agency;
    private String clientName;
    private double balance;

    public AccountTerminal(int number, String agency, String clientName, double balance) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountTerminal{" +
                "number=" + number +
                ", agency='" + agency + '\'' +
                ", clientName='" + clientName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the account number:");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the agency:");
        String agency = scanner.nextLine();

        System.out.println("Enter the client's name:");
        String clientName = scanner.nextLine();

        System.out.println("Enter the balance:");
        double balance = scanner.nextDouble();

        AccountTerminal account = new AccountTerminal(number, agency, clientName, balance);
        System.out.println("Hello " + clientName + ", thank you for creating an account with our bank. Your agency is "
                + agency + ", account " + number + " and your balance $" + balance
                + " is now available for withdrawal.");

        scanner.close();
    }
}