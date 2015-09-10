package com.allmycode.bank;

import org.allyourcode.bank.Account;

public class UseAccountFromOutside {

  public static void main(String[] args) {
    Account account = new Account();
    account.customerName = "Occam";
    String nameBackup = account.customerName;
    // System.out.println(account.address);
    // account.internalIdNumber = 716010;

    /*
     * This code intentionally CONTAINS ERRORS. Uncomment the other lines to see
     * the errors.
     */
  }

}
