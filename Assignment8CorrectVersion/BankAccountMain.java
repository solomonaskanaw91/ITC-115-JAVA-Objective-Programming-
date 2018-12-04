// The client for BankAccount class

public class BankAccountMain {

	public static void main(String[] args) {

			BankAccount Solomon = new BankAccount("Solomon", 1565.00, 2.00);
			BankAccount Niome = new BankAccount("Niome", 590.00, 3.00);
			
			// Bank transaction fees for Solomon and Niome
			solomon.setTransactionFee(3.68);
			
			// make a deposit
			solomon.deposit(190.00);
			niome.deposit(150.00);
			
			// withdraw money
			solomon.withdraw(50.00);
			niome.withdraw(65.00);
			
			// print results
			System.out.println(solomon.toString());
			System.out.println();
			System.out.println(niome.toString());
			System.out.println();			
		
	}

}
