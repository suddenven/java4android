package org.allyourcode.bank;

public class UseAccount {

  public static void main(String[] args) {
    Account account = new Account();
    account.customerName = "Occam";
    String nameBackup = account.customerName;
    System.out.println(account.address);
    // account.internalIdNumber = 716010;

    /*
     * This code intentionally CONTAINS ERRORS. Uncomment the other lines to see
     * the errors.
     */
  }

}
