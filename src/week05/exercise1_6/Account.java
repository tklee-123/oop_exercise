package week05.exercise1_6;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.print("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.print("Amount exceeded balance");
        }
        return this.balance;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Account")
                .append("[")
                .append("id = ")
                .append(this.id)
                .append(", ")
                .append("name = ")
                .append(this.name)
                .append(", ")
                .append("balance = ")
                .append(this.balance)
                .append("]");
        return description.toString();
    }

}
