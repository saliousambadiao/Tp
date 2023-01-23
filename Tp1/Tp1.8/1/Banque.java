public class Banque {
  private String firstName;
  private String lastName;
  private int accountNumber;
  private int initialBalance;
  private int overdraft;

  public Banque(
    String firstName,
    String lastName,
    int accountNumber,
    int initialBalance,
    int overdraft
  )
    throws AccountNumberException, BalanceException {
    this.firstName = firstName;
    this.lastName = lastName;
    setAccountNumber(accountNumber);
    setInitialBalance(initialBalance);
    setOverdraft(overdraft);
  }

  //this method is synchronized because we don't want that it be executed with the next method together
  public synchronized void crediter(int amount) throws BalanceException {
    if (amount < 0) throw new BalanceException();
    this.initialBalance += amount;
  }

  //this method is synchronized because we don't want that it be executed with the previous method together
  public synchronized void debiter(int amount) throws DebitException {
    if (
      amount > (this.initialBalance + this.overdraft)
    ) throw new DebitException();
    this.initialBalance -= amount;
  }

  //this method provides us to have the firstName of the customer
  public String getFirstName() {
    return firstName;
  }

  //this method provides us to control the firstName of the customer
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  //this method provides us to have the lastName of the customer
  public String getLastName() {
    return lastName;
  }

  //this method provides us to control the lastName of the customer
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  //this method provides us to have the account-number of the customer
  public int getAccountNumber() {
    return accountNumber;
  }

  //this method provides us to control the account-number of the customer
  public void setAccountNumber(int accountNumber)
    throws AccountNumberException {
    if (accountNumber < 0) throw new AccountNumberException();
    this.accountNumber = accountNumber;
  }

  //this method provides us to have the balance of the customer
  public int getInitialBalance() {
    return initialBalance;
  }

  //this method provides us to control the balance of the customer
  public void setInitialBalance(int initialBalance) throws BalanceException {
    if (initialBalance < 0) throw new BalanceException();
    this.initialBalance = initialBalance;
  }

  //this method provides us to have the overdraft of the customer
  public int getOuverdraft() {
    return overdraft;
  }

  //this method provides us to control the overdraft of the customer
  public void setOverdraft(int overdraft) throws BalanceException {
    if (overdraft < 0) throw new BalanceException();
    this.overdraft = overdraft;
  }

  //this method provides us to have the historical of the customer account
  public void getHistorique() {
    System.out.println("Last Name: " + getLastName());
    System.out.println("First Name: " + getFirstName());
    System.out.println("Account Number: " + getAccountNumber());
    System.out.println(
      "The amount of the balance is: " + this.getInitialBalance()
    );
  }
}
