import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class U2L05ReviewAssignmentBank {

	public static void main(String[] args) {
		
		double money = 100.1;
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString = formatter.format(money);
		System.out.println(moneyString);
		// create an instance of a BankAccount
		//BankAccount ericasAccount = new BankAccount ("Erica Davis", 500, 150)
		//wants to be alerted when bank account drops below 150
		BankAccount ricardasAccount = new BankAccount ("Ricarda Hill", 7000, 150);
		
		//deposit a check
		//call deposit 
		//ericasAccount.deposit(7000);
		//ricardasAccount.deposit()
		String input = JOptionPane.showInputDialog("How much do you want to deposit?");
		int deposit = Integer.parseInt(input);
		ricardasAccount.deposit(deposit);
		
		
	
		//withdraw
		//ericasAccount.withdraw(5);
		input = JOptionPane.showInputDialog("How much do you want to withdraw?");
		int withdraw = Integer.parseInt(input);
		ricardasAccount.withdraw(withdraw);
		
				
		
		//display the balance (uses toString method)
		//System.out.println(ericasAccount);

	}

}
