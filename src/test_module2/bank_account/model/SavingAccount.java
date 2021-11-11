package test_module2.bank_account.model;

public class SavingAccount extends BankAccount {
    private int savingMoney;
    private String daySaving;
    private double interest;
    private int period;

    public SavingAccount() {
    }

    public SavingAccount(int idAccount, String codeAccount, String nameAccount, String dayAccount, int savingMoney, String daySaving, double interest, int period) {
        super(idAccount, codeAccount, nameAccount, dayAccount);
        this.savingMoney = savingMoney;
        this.daySaving = daySaving;
        this.interest = interest;
        this.period = period;
    }

    public int getSavingMoney() {
        return savingMoney;
    }

    public void setSavingMoney(int savingMoney) {
        this.savingMoney = savingMoney;
    }

    public String getDaySaving() {
        return daySaving;
    }

    public void setDaySaving(String daySaving) {
        this.daySaving = daySaving;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return super.toString() + "," + savingMoney + "," + daySaving + "," + interest + "," + period;
    }
}
