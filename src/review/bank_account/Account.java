package review.bank_account;

public class Account {
    private long accountNumber;
    private String name;
    private double amount;
    private final double INTERESTRATE=0.035;

    public Account(){

    }

    public Account(long accountNumber, String name, double amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }

    public Account(long accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = 50.0;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return this.INTERESTRATE;
    }
    public void addAmount(double money){
        if (money<0){
            System.out.println("Số tiền nạp vào tài khoản phải lớn hơn 0");
        }else {
            this.setAmount(this.getAmount()+money);
        }

    }
    public void withdraw(double money){
        if (money > this.getAmount()){
            System.out.println("Số tiền rút không được lớn hơn số tiền trong tài khoản");
        } else {
            this.setAmount(this.getAmount()-money);
        }
    }
    public void expire(){
        this.setAmount(this.getAmount()+this.getAmount()*this.getInterestRate());
    }

    public void transfer (double money){
        if (money > this.getAmount()){
            System.out.println("Số tiền cần chuyển không được lớn hơn số tiền trong tài khoản");
        } else {
            this.setAmount(this.getAmount()-money);
        }
    }

}
