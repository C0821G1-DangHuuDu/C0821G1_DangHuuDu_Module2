package test_module2.bank_account.model;

public class PaymentAccount extends BankAccount {
    private String cardNumber;
    private int amountMoney;

    public PaymentAccount() {
    }

    public PaymentAccount(int idAccount, String codeAccount, String nameAccount, String dayAccount, String cardNumber, int amountMoney) {
        super(idAccount, codeAccount, nameAccount, dayAccount);
        this.cardNumber = cardNumber;
        this.amountMoney = amountMoney;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(int amountMoney) {
        this.amountMoney = amountMoney;
    }

    @Override
    public String toString() {
        return super.toString() + "," + cardNumber + "," + amountMoney;
    }
}
