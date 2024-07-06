import java.util.Objects;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    // Constructors
    public CurrentAccount() {
        super();
    }

    public CurrentAccount(String number, double balance, Client client, double overdraftLimit) {
        super(number, balance, client);
        this.overdraftLimit = overdraftLimit;
    }

    // Getters and Setters
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CurrentAccount that = (CurrentAccount) o;
        return Double.compare(that.overdraftLimit, overdraftLimit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), overdraftLimit);
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "overdraftLimit=" + overdraftLimit +
                "} " + super.toString();
    }
}