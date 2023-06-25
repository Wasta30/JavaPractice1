package Day31_CustomClass_Constructors;

public class CapitalOne {

    public static void main(String[] args) {


        BankAccount account1 = new BankAccount();
        account1.setInfo("Wasta Tariq",123456789,0);

        System.out.println(account1);

        account1.deposit(1000);

        account1.CheckBalance();

        account1.withdraw(900);
        account1.CheckBalance();

        account1.deposit(500);
        account1.CheckBalance();


        System.out.println("----------------");



       BankAccount account2 = new BankAccount();

       account2.setInfo("Taha Tariq",987654321,0);
       account2.deposit(100000);
        account2.CheckBalance();


    //instance measn each object have their own copies


    }





}
