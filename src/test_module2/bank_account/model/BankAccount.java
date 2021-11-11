package test_module2.bank_account.model;

import java.util.Objects;

public abstract class BankAccount {
    private int idAccount;
    private String codeAccount;
    private String nameAccount;
    private String dayAccount;

    public BankAccount() {
    }

    public BankAccount(int idAccount, String codeAccount, String nameAccount, String dayAccount) {
        this.idAccount = idAccount;
        this.codeAccount = codeAccount;
        this.nameAccount = nameAccount;
        this.dayAccount = dayAccount;
    }

    public int getIdAccount() {
        return idAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(codeAccount, that.codeAccount);
    }


    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getCodeAccount() {
        return codeAccount;
    }

    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getDayAccount() {
        return dayAccount;
    }

    public void setDayAccount(String dayAccount) {
        this.dayAccount = dayAccount;
    }

    @Override
    public String toString() {
        return idAccount + "," + codeAccount + "," + nameAccount + "," + dayAccount;
    }
}
