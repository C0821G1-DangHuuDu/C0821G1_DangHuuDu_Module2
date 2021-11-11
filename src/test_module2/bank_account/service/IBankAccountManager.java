package test_module2.bank_account.service;

import test_module2.bank_account.model.BankAccount;

public interface IBankAccountManager {
    void addNew(BankAccount bankAccount);

    void delete();

    void display();

    void findAccount(String key);
}
