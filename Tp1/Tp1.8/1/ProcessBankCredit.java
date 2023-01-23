public class ProcessBankCredit extends Thread {
  Banque customer;

  public ProcessBankCredit(Banque customer) {
    this.customer = customer;
  }

  public void run() {
    try {
      customer.crediter(450000);
    } catch (BalanceException be) {
      be.getMessage();
    }
  }
}
