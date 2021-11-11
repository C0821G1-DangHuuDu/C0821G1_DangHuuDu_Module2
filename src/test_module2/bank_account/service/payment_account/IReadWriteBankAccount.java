package test_module2.bank_account.service.payment_account;

import test_module2.bank_account.model.BankAccount;

import java.util.List;

public interface IReadWriteBankAccount {
    public void writePaymentAccountList(BankAccount BankAccount);

    public List<BankAccount> readPaymentAccountList();
}
