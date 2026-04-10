package bank_acc;

public class CheckingAccount extends Account {
    private static final int FREE_TRANSACTIONS = 3;
    private static final double FEE = 0.02;
    private int transactionCount = 0;

    public CheckingAccount(int accNumber) { super(accNumber); }

    @Override
	public void deposit(double sum) {
	    super.deposit(sum);
	    transactionCount++;
	}
	
	@Override
	public void withdraw(double sum) {
	    super.withdraw(sum);
	    transactionCount++;
	}
	
	public void deductFee() {
	    if (transactionCount > FREE_TRANSACTIONS) {
	        int extra = transactionCount - FREE_TRANSACTIONS;
	        double totalFee = extra * FEE;
	        super.withdraw(totalFee); 
	        System.out.println("Fee deducted: $"
	            + String.format("%.2f", totalFee));
	    }
	}
	
	@Override
	public String toString() {
	    return "[Checking] " + super.toString()
	        + " | Transactions: " + transactionCount;
	}
	}