public class Main {

  public static void main(String[] args) {

      Client client1 = new Client("Max", "123.456.789-00", "123 Center");
      Client client2 = new Client("pedro", "987.654.321-00", "456 Center");

      CurrentAccount currentAccount1 = new CurrentAccount("001", 1000.0, client1, 500.0);
      SavingsAccount savingsAccount1 = new SavingsAccount("002", 5000.0, client2, 0.05);

      Bank bank = new Bank("My Bank");

      bank.addAccount(currentAccount1);
      bank.addAccount(savingsAccount1);

      System.out.println("Bank: " + bank.getName());
      System.out.println("Bank accounts:");
      for (Account account : bank.getAccounts()) {
          System.out.println(account);
      }

      currentAccount1.deposit(500.0);
      savingsAccount1.withdraw(200.0);

      System.out.println("\nAfter banking operations:");
      for (Account account : bank.getAccounts()) {
          System.out.println(account);
      }
  }
}