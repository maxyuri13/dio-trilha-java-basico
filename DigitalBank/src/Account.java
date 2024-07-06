import java.util.Objects;

public class Account {
    private String number;
    private double balance;
    private Client client;

    public Account() {
    }

    public Account(String number, double balance, Client client) {
        this.number = number;
        this.balance = balance;
        this.client = client;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void deposit(double valor) {
        this.balance += valor;
    }

    public void withdraw(double valor) {
        this.balance -= valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", client=" + client +
                '}';
    }
}