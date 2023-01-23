public class AccountNumberException extends Exception {

  public AccountNumberException() {
    super("The account number must be positive !");
  }

  public String getMessage() {
    return super.getMessage();
  }
}
