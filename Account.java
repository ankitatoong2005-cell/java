class Account {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        Account a1 = new Account();

        a1.balance = 1000;
        a1.deposit(500);

        System.out.println("Updated Balance: " + a1.balance);
    }
}
