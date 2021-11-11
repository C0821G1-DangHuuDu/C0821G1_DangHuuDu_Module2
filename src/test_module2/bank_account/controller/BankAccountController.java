package test_module2.bank_account.controller;

import test_module2.bank_account.model.BankAccount;
import test_module2.bank_account.model.PaymentAccount;
import test_module2.bank_account.model.SavingAccount;
import test_module2.bank_account.service.payment_account.BankAccountManager;

import java.util.Scanner;

public class BankAccountController {
    public static void managerMainMenu() {
        BankAccountManager bankAccountManager = new BankAccountManager();
        int choose;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG--");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1.\tThêm mới");
            System.out.println("2.\tXóa");
            System.out.println("3.\tXem danh sách các tài khoản ngân hàng");
            System.out.println("4.\tTìm kiếmt");
            System.out.println("5.\tThoát");

            System.out.print("Mời bạn nhập chức năng: ");
            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    System.out.print("Nhập vào ID: ");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.print("Nhập vào mã tài khoản: ");
                    String codeAccount = (input.nextLine());
                    System.out.print("Nhập vào tên tài khoản: ");
                    String nameAccount = (input.nextLine());
                    System.out.print("Nhập vào ngày tạo tài khoản: ");
                    String dayAccount = (input.nextLine());
                    System.out.println("\n");
                    System.out.println("--Tài Khoản muốn thêm--");
                    System.out.println("1.\tThêm tài khoản thanh toán:");
                    System.out.print("2.\tThêm tài khoản tiét kiệm:");
                    System.out.print("Mời bạn chọn loại tài khoản muốn thêm: ");
                    choose = Integer.parseInt(input.nextLine());
                    switch (choose) {
                        case 1:
                            System.out.print("Nhập vào Số thẻ tài khoản: ");
                            String cardNumber = (input.nextLine());
                            System.out.print("Nhập vào Số tiền tài khoản: ");
                            int amountMoney = Integer.parseInt(input.nextLine());
                            BankAccount paymentAccount = new PaymentAccount(id, codeAccount, nameAccount, dayAccount, cardNumber, amountMoney);
                            bankAccountManager.addNew(paymentAccount);
                            break;
                        case 2:
                            System.out.print("Nhập vào Số tiền tiết kiệm: ");
                            int savingMoney = Integer.parseInt(input.nextLine());
                            System.out.print("Nhập vào ngày gửi Tiết kiệm: ");
                            String daySaving = (input.nextLine());
                            System.out.print("Nhập vào lãi suất: ");
                            double interest = Double.parseDouble(input.nextLine());
                            System.out.print("Nhập vào kỳ hạn: ");
                            int period = Integer.parseInt(input.nextLine());
                            BankAccount savingAccount = new SavingAccount(id, codeAccount, nameAccount, dayAccount, savingMoney, daySaving, interest, period);
                            bankAccountManager.addNew(savingAccount);
                            break;
                    }
                case 2:

                case 3:
                    bankAccountManager.display();
                    break;
                case 4:
                    System.out.print("Nhập vào tên hoặc mã muốn tìm kiếm: ");
                    String findKey = (input.nextLine());
                    bankAccountManager.findAccount(findKey);
                    break;
            }
        } while (choose != 5);


    }

    public static void main(String[] args) {
        managerMainMenu();
    }
}
