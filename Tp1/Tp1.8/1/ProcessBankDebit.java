public class ProcessBankDebit extends Thread {
  Banque customer;

  public ProcessBankDebit(Banque customer) {
    this.customer = customer;
  }

  public void run() {
    try {
      this.customer.debiter(50000);
    } catch (DebitException de) {
      de.getMessage();
    }
  }
}
