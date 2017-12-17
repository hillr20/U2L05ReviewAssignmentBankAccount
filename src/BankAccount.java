import javax.swing.JOptionPane;

public class BankAccount {
	//2 things in a class: attributes and methods
	//attributes
	
	public String name;
	private double currentBalance;
	public double lowestBalance;
	
	//methods
	public BankAccount (String name, double currentBalance, double lowestBalance){
		name = "Ricarda Hill";
		currentBalance = 7000;
		lowestBalance = 150;
	}
	int hold;
	//constructors
	public void deposit(int deposit) {
		//balance - amount = new amount
		
		//currentBalance = currentBalance + deposit;
		currentBalance = currentBalance + deposit;
		//currentBalance = new currentBalance;
				
	}
	
	public void withdraw(int withdraw) {
		//don't need 'String yes'
		//double currentBalance;
		//System.out.println("Do you want to withdraw?");
		String ans = JOptionPane.showInputDialog("Do you want to withdraw? Answer yes or no.");
		//String yes;
		if (ans.equals("yes")) {
			currentBalance = currentBalance - withdraw;	
			System.out.println("Your current balance is " + currentBalance);
		}
		else {
			System.out.println("You have not withdrawn anything from your account.");
			
		}
		
		
		
		
		
		currentBalance = currentBalance - withdraw;
		//currentBalance = new currentBalance;
		
		if (currentBalance < 150.0) {
			System.out.println("Your current balance is less than $150.00!");
			
			
			
		}
		
	}
	
	private void setBalance(int withdraw) {
		if (currentBalance > 0) {
			System.out.println(currentBalance);
			
		}
		else {
			System.out.println("Your current balance is below zero.");
		}
			
	}
	
	private int getBalance (int currentBalance) {
		return currentBalance;
		
	}
	public String toString(){
		String info = "Ricarda Hill's account holds" + currentBalance + " with a lowest"
				+ "allowable balance of " + lowestBalance;
		return info;
		
	}
	
	
		
	
}
