package bank_acc;

public class Account {
    private double balance;
    private int accNumber;

    public Account(int accNumber) {
        this.balance = 0.0;
        this.accNumber = accNumber;
    }
	public void deposit(double sum) {
	    if (sum <= 0) { System.out.println("Invalid amount"); return; }
	    balance += sum;
	}
	
	public void withdraw(double sum) {
	    if (sum <= 0 || sum > balance) {
	        System.out.println("Invalid "); return;
	    }
	    balance -= sum;
	}
	
	public void transfer(double amount, Account other) {
	    withdraw(amount);
	    other.deposit(amount);
	}
	
	public double getBalance()     { return balance; }
	public int    getAccNumber()   { return accNumber; }
	
	@Override
	public String toString() {
	    return "Account #" + accNumber
	        + " | Balance: $" + String.format("%.2f", balance);
	}
	
	public final void print() { System.out.println(toString()); }
}