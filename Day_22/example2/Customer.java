package Day_22.example2;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001","Rahul");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(0);
    }
}
