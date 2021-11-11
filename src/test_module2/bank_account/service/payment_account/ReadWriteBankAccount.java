package test_module2.bank_account.service.payment_account;

import test_module2.bank_account.model.BankAccount;
import test_module2.bank_account.model.PaymentAccount;
import test_module2.bank_account.model.SavingAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteBankAccount implements IReadWriteBankAccount {
    public ReadWriteBankAccount() {
    }

    ;
    private static List<BankAccount> bankAccountList = new ArrayList<>();

    @Override
    public void writePaymentAccountList(BankAccount paymentAccount) {
        try {
            FileWriter fileWriter = new FileWriter("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\test_module2\\bank_account\\data\\BankAccount.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(paymentAccount.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<BankAccount> readPaymentAccountList() {
        bankAccountList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\Code Gym\\C0821G1_Dang Huu Du\\Module 2\\src\\test_module2\\bank_account\\data\\BankAccount.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] bankAccounts = line.split(",");
                BankAccount bankAccount;
                if (bankAccounts.length == 6) {
                    bankAccount = new PaymentAccount(Integer.parseInt(bankAccounts[0]), bankAccounts[1], bankAccounts[2], bankAccounts[3], bankAccounts[4], Integer.parseInt(bankAccounts[5]));
                } else {
                    bankAccount = new SavingAccount(Integer.parseInt(bankAccounts[0]), bankAccounts[1], bankAccounts[2], bankAccounts[3], Integer.parseInt(bankAccounts[4]), bankAccounts[5], Double.parseDouble(bankAccounts[6]), Integer.parseInt(bankAccounts[7]));
                }
                bankAccountList.add(bankAccount);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bankAccountList;

    }
}
