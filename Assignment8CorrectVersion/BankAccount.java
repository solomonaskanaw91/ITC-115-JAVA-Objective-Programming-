import java.text.NumberFormat;
//NumberFormat is the abstract base class for all number formats.
// Two persons are the BankAccount object that represents each customer.
// Data includes customer name and balance of money in amount and also include transactions fees.

public class BankAccount {
	String name;
	double balance;
	double transactionFee = 0.00;
	
	
	//constructor method 
	public BankAccount(String name, double balance, double transactionFee) {
		this.name = name;
		this.balance = balance;
		this.transactionFee = transactionFee;	
	}
    
	public void deposit(double amount) {
			balance = balance + amount;
	} 
	
	//conditional created to prevent negative balance

	public void withdraw(double amount) {
		if((balance - amount - transactionFee) < 0) {
			System.out.println("Unsufficient funds.");
		} else {
			balance = balance - (amount + transactionFee);
		}
	} 
	
	public String getBalanceFormatted() {
        String formattedBalance = NumberFormat.getCurrencyInstance().format(this.balance);
        return formattedBalance;
    }
	
	public String toString() {
		return (name + ", " + getBalanceFormatted());
	}
}
