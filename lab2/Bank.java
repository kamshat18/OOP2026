package bank_acc;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts = new Vector<>();

    public void openAccount(Account acc) { accounts.add(acc); }

    public void closeAccount(int accNumber) {
        accounts.removeIf(a -> a.getAccNumber() == accNumber);
    }

    
    public void update() {
        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
            } else if (acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFee();
            }
        }
    }

    public void printAll() { accounts.forEach(Account::print); }
}