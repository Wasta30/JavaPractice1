package Day31_CustomClass_Constructors;

public class BankAccount {

public String acountHolder;
public int accountNumber;
public double balance;


    public void setInfo(String acountHolder, int accountNumber, double balance) {
        this.acountHolder = acountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String toString() {
        return "BankAccount{" +
                "acountHolder='" + acountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=$" + balance +
                '}';
    }


public void CheckBalance(){

    System.out.println("Your available balance is: " +balance);
}


public void deposit (double amount){
if(amount<0){
    System.out.println("Depositing amount can not be zero or negative");
    return;// to exit the method
}
balance+= amount;

}
public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance");
            return;
        }
        // if withdraw amount greater than balance(above cond)
    // if withdarawing amount iss neg or zero then exit func
        if(amount<=0){
            System.out.println("withdrawing amount can not be negative or zero");
        return;// retrun only exit func not terminate whole
        }
        balance -= amount;

}
}
/*
BankAccount Task:
	        Attributes:
	                1. accountHolder, 2. accountNumber, 3. balance

 */
/*
 Actions:
	        	1. setInfo(): sets the accountHolder and accountNumber attributes
	        	2. toString()
	            3. checkBalance():displays the available balance
	            2. deposit(): increases the balance by the given amount
				3. withdraw(): decreases the balance by the given amount
 */