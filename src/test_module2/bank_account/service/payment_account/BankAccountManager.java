package test_module2.bank_account.service.payment_account;

import test_module2.bank_account.model.BankAccount;
import test_module2.bank_account.service.IBankAccountManager;

import java.util.List;
import java.util.Scanner;

public class BankAccountManager implements IBankAccountManager {
    ReadWriteBankAccount readWriteBankAccount = new ReadWriteBankAccount();
    List<BankAccount> bankAccountList;

    public BankAccountManager() {
        bankAccountList = readWriteBankAccount.readPaymentAccountList();
    }

    Scanner input = new Scanner(System.in);

    @Override
    public void addNew(BankAccount bankAccount) {

        bankAccountList.add(bankAccount);
        readWriteBankAccount.writePaymentAccountList(bankAccount);
        System.out.println("Add success!");

    }

    @Override
    public void delete() {


    }

    @Override
    public void display() {
        for (BankAccount bankAccount : bankAccountList) {
            System.out.println(bankAccount);
        }

    }

    @Override
    public void findAccount(String key) {
        boolean check = false;
        for (int i = 0; i < bankAccountList.size(); i++) {
            if (this.bankAccountList.get(i).getCodeAccount().contains(key) || this.bankAccountList.get(i).getNameAccount().contains(key)) {
                System.out.println(this.bankAccountList.get(i));
                check = true;
            }

        }
        if (check == false) {
            System.out.println("Không tìm thấy");
        }
    }
}
