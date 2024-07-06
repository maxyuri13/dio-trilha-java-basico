import java.util.Objects;

public class SavingsAccount extends Account {
    private double yieldRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(String number, double balance, Client client, double yieldRate) {
        super(number, balance, client);
        this.yieldRate = yieldRate;
    }

    public double getYieldRate() {
        return yieldRate;
    }

    public void setYieldRate(double yieldRate) {
        this.yieldRate = yieldRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SavingsAccount that = (SavingsAccount) o;
        return Double.compare(that.yieldRate, yieldRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), yieldRate);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "yieldRate=" + yieldRate +
                "} " + super.toString();
    }
}
