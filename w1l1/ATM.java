/*<listing chapter="1" number="1">*/
/**
Listing 1.1
@author Koffman and Wolfgang
 */
package w1l1;

/** The interface for an ATM. */
public interface ATM {

    /**
     *  Verifies a user's PIN.
     *  @param pin The user's PIN
     */
    boolean verifyPIN(String pin);

   
    /**
     * Withdraws a specified amount of money
     *  @param amount The amount of money withdrawn
     *  @return Whether or not the operation is successful
     */
    boolean withdraw(double amount);

    /**
     * return the result of an operation
     *  @return The amount of balance 
     */
    
    double showBalance();
   
    /**
     * Deposits a specified amount of money
     * @param amount The amount of money deposit
     * @return Whether or not the operation is successful
     */
    boolean deposit(double amount);
}
/*</listing>*/
