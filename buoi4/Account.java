public class Account {
    private int id;
    private String name;
    private int balance;

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount) {
        this.balance += amount;
    }

    public void debit(int amount) {
        this.balance -= amount;
    }

    public void transferTo(Account another, int amount) {
        this.debit(amount);
        another.credit(amount);
    }

    public void display() {
        System.out.println("ID: " + Integer.toString(this.id));
        System.out.println("Name: " + this.name);
        System.out.println("Balance: " + Integer.toString(this.balance));
    }

    public static void Main(String[] args) {
        Account acc1 = new Account(1, "A", 1000);
        Account acc2 = new Account(2, "B", 500);

        acc1.display();
        acc2.display();

        acc1.transferTo(acc2, 200);

        System.out.println("----");
        acc1.display();
        acc2.display();
    }
}
