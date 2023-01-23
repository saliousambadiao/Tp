public class Caissier {

  public static void main(String[] args) {
    Banque customer = null;
    try {
      customer = new Banque("Saliou Samba", "DIAO", 34546212, 230000, 20000);
    } catch (BalanceException be) {
      be.getMessage();
    } catch (AccountNumberException ane) {
      ane.getMessage();
    }
    ProcessBankCredit pbc = new ProcessBankCredit(customer);
    ProcessBankDebit pbd = new ProcessBankDebit(customer);

    pbc.start();
    pbd.start();
    // assert customer != null;
    customer.getHistorique();
  }
}
