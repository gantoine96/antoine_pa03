package antoine_problem2;

public class SavingsAccount {
	   //Attributes
	   private static double annualInterestRate=0;
	   private double savingsBalance;
	   //Constructor
	   public SavingsAccount(double amt) {
	       if(amt<0) {
	           this.savingsBalance=0;
	       }
	       else {
	           this.savingsBalance=amt;
	       }
	   }
	   //Monthly interest calculate
	   public void calculateMonthlyInterest() {
	       savingsBalance+=savingsBalance*(annualInterestRate/(12*100));
	   }
	   //Modify interest rate
	   public void modifyInterestRate(double ir) {
	       if(ir<0) {
	           SavingsAccount.annualInterestRate=0;
	       }
	       else {
	           SavingsAccount.annualInterestRate=ir;
	       }
	   }
	   //Get savings balance
	   public double getSavingsBalance() {
	       return savingsBalance;
	   }
	}