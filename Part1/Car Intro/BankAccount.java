
/**
 * Write a description of class BankAccount here.
 *
 * @author Jason Chan
 * @version 1.0
 */
import comp102x.IO;
public class BankAccount
{
    // instance variables - replace the example below with your own
    private double balance = 0.0;
    private String owner = "NoName";
    
    // constructor with bank balance as zero and name as no name
    public BankAccount(){};
    
    //constructor with specified balance and name
    public BankAccount(double initialBalance, String name){
        
        balance = initialBalance;
        owner = name;
    
    }
    
    // methods TODO remember to use lower camelCase for methods
    // 1. Deposit (mutator / setter)
    // 2, Withdraw (mutator / setter)
    // 3. Get Balance (access methods / getter)
    public void deposit(double dAmount){
        
        balance += dAmount;
   
    }
    
    public void withdraw(double wAmount){
        
        balance -= wAmount;
        
    } 
    
    public double getBalance(){
        return balance;
    }
    
    /**
     * Main method for testing bank account
     */
    
    public static void main(String[] args){
        
        BankAccount testAccount;
        // zero balance and no name
        testAccount = new BankAccount();
        // or can use BankAccount testAccount = new BankAccount()
        testAccount.deposit(100);
        testAccount.withdraw(50);
        IO.outputln(testAccount.owner + "'s account has a balance of $" + testAccount.balance);
        
        
        // my account
        BankAccount MyAccount = new BankAccount(200, "Jason");
        MyAccount.deposit(100);
        MyAccount.withdraw(23);
        IO.outputln(MyAccount.owner + "'s account has a balance of $" + MyAccount.balance);
        
    }
}
