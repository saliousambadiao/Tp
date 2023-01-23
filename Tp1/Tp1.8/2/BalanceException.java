public class BalanceException extends Exception {

  public BalanceException() {
    super("The amount of the balance must be positive !");
  }

  public String getMessage() {
    return super.getMessage();
  }
}
