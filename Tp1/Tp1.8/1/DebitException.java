public class DebitException extends Exception {

  public DebitException() {
    super(
      "Unable to debit the account, the amount is greater than the balance and the authorized overdraft"
    );
  }

  public String getMessage() {
    return super.getMessage();
  }
}
