/**
 * 
 */
package gov.in.oupp.training.java.corejava.basics;

import java.util.Scanner;

/**
 * @author AKG
 *
 */

class BankATM {

	public static boolean validateATMPIN(int atmPIN) {
		Scanner scc = new Scanner(System.in);
		System.out.print("Enter Your ATM PIN [4 digit]: ");
		int pin;
		pin = scc.nextInt();
		// scc.close();

		if (pin == atmPIN) {
			return true;
		}
		return false;

	}

	public static void getBalance(String name, int accNum, float balance) {
		String customerName = name;
		int accountNumber = accNum;
		float accountBalance = balance;

		System.out.println("Details of " + customerName + ":\n--------------------");
		System.out.println("Account Holder Name: " + customerName + "\nAccount Number: " + accountNumber
				+ "\nAccount Balance: " + accountBalance);
	}

	// withdraw method
	public static float withdraw(float balance, float wamount) {
		if (balance > wamount) {
			balance -= wamount;
			System.out.print("New Balance is: " + balance);
		} else {
			System.out.println("Insufficient Balance. Try with lesser amount.");
		}
		return balance;
	}

	// deposit method
	public static float deposit(float balance, float damount) {
		balance += damount;
		System.out.print("New Balance is: " + balance);
		return balance;
	}
}

public class ATMSimulator {

	/**
	 * @param args
	 */

	static String name;
	static int accountNumber;
	static int atmPIN;
	static float balance;
	static float wamount;
	static float damount;

	public static void main(String[] args) {
		System.out.println("Welcome to ATM !!");

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Name: ");
		name = sc.nextLine();
		System.out.print("Enter Your Account Number: ");
		accountNumber = sc.nextInt();
		System.out.print("Enter Your ATM PIN [4 digit]: ");
		atmPIN = sc.nextInt();
		System.out.print("Enter Your Account Balance: ");
		balance = sc.nextFloat();

		System.out.println("Welcome to the Bank!!");
		boolean isActive = true;
		while (isActive) {
			System.out.println("\n\nATM Operation\n---------------");
			int choice = 0;
			System.out.println("\n\nOperations\n----------");
			System.out.println("1.Check Balance");
			System.out.println("2.Withdraw");
			System.out.println("3.Deposit");
			System.out.println("4.Exit");
			System.out.print("\nEnter Your Choice [1/2/3/4]: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (BankATM.validateATMPIN(atmPIN)) {
					BankATM.getBalance(name, accountNumber, balance);
				} else {
					System.out.println("Invalid PIN!! Try Again.");
				}
				break;

			case 2:
				if (BankATM.validateATMPIN(atmPIN)) {
					System.out.print("Enter your amount for withdraw: ");
					wamount = sc.nextFloat();
					balance = BankATM.withdraw(balance, wamount);
				} else {
					System.out.println("Invalid PIN!! Try Again.");
				}
				break;

			case 3:
				if (BankATM.validateATMPIN(atmPIN)) {
					System.out.print("Enter your amount for deposit: ");
					damount = sc.nextFloat();
					balance = BankATM.deposit(balance, damount);
				} else {
					System.out.println("Invalid PIN!! Try Again.");
				}
				break;

			case 4:
				boolean isExit;
				System.out.println("Do you want to exit? [true/false] : ");
				isExit = sc.nextBoolean();
				if (isExit) {
					isActive = false;
				} else {
					continue;
				}
				break;

			}
		}

		System.out.println("Good Bye !! See you again !");

		// sc.close();
	}

}