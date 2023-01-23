public class ProcessBankCredit implements Runnable {
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
