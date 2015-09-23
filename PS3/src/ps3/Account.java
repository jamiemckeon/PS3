package ps3;

import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public Account() {

	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public double getMonthlyInterestRate() {
		double MonthlyIR = annualInterestRate / 12;
		return MonthlyIR;
	}

	public double withdraw(double amount) {
		balance = balance - amount;
		return balance;

	}

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

}
