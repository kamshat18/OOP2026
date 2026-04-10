package bank_acc;

public class SavingsAccount extends Account {
    private double interestRate; 

    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }

  
    public void addInterest() {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
        System.out.println("Interest added: $"
            + String.format("%.2f", interest));
    }

    @Override
    public String toString() {
        return "[Savings] " + super.toString()
            + " | Rate: " + interestRate + "%";
    }
}