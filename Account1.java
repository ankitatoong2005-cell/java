class Account1 
{
    int balance = 1000;

    void deposit(int amount) 
    {

        balance = balance + amount;
    }

    public static void main(String[] args) 
    {

        Account1 a = new Account1();

        a.deposit(500);

        System.out.println("Updated Balance: " + a.balance);
    }
}