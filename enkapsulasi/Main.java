package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount liberlyDjara = new BankAccount(100);

        liberlyDjara.withdraw(10);
        System.out.println("Current balance is: " + liberlyDjara.getBalance());
    }
}
