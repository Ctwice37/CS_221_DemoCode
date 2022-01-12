package w1l1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * The class ATMbankAmerica
 */
public class ATMbankAmerica implements ATM {
    /*<exercise chapter="1" section="1" type="programming" number="4">*/

    /** The user's PIN */
    private String pin;
    private String accountno;
    private double balance;
    boolean pinstatus = false;


  private void setPin(String pin) {
    	this.pin = pin;
    	pinstatus = true;
		
	}

	public ATMbankAmerica(String accountno, double amount) {
		
		this.accountno = accountno;
		this.balance = amount;
	}

	/**
     * Verifies a user's PIN.
     * @param pin The user's PIN
     * @return true if the user's PIN is verified
     */
    @Override
    public boolean verifyPIN(String pin) {
        return this.pin.equals(pin);
    }


    /**
     * Withdraws a specified amount of money
     * @param amount The amount of money withdrawn
     * @return Whether or not the operation is successful
     */
    @Override
    public boolean withdraw(double amount) {
    	if (amount<=balance)
    	{
    		balance= balance - amount;
    		return true;
    	}
    	else
        return false;
    }

    /**
     * Deposits a specified amount of money
     * @param amount The amount of money deposit
     * @return Whether or not the operation is successful
     */
    @Override
    public boolean deposit(double amount){
    	if(amount>0){
    	balance +=amount;
    	return true;
    	}
    	else
    		return false;
    }

    /**
     * return an account balance
     */
    @Override
    public double showBalance() {
    	return balance;
    }

    public void showAccounts() {
    	System.out.println("printing all accounts");
	}

    public static void main(String args[]){
    	
    	ATMbankAmerica acc1 = new ATMbankAmerica("720456",1000);
		ATM acc2 = new ATMbankAmerica("720456",1000);


    	acc1.setPin("1234");
    	System.out.println("Pin Verification : " + acc1.verifyPIN("1234"));
    	System.out.println("Money Deposited status : " + acc1.deposit(1000));
    	System.out.println("Money WithDraw status : " + acc1.withdraw(3000));
    	System.out.println("Balance Amount : " + acc1.showBalance());
      	
    }
}

