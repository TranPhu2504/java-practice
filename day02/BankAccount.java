public class BankAccount {
    String owner;
    double balance;
    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void showInfo(){
        System.out.println("Owner:" + owner +" has: $" + balance);
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Phu",50000);
        acc.deposit(200);
        acc.showInfo();
    }
}
