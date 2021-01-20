public class User {


    public static void main(String[] args) {
       BankAccount c1 = new BankAccount("Sumit", 5000);
       BankAccount c2 = new BankAccount("Bina", 6000);
       BankAccount c3 = new BankAccount("Shishir");
       BankAccount c4 = new BankAccount("Dhani");

       // withdraw
       System.out.println("Withdrawal: ");
       System.out.println("--------------------------");
       c1.withDraw(2000,200);
       System.out.println();
       c2.withDraw(1000);
       System.out.println();
       c3.withDraw(300);
       System.out.println();
       c4.withDraw(1200,100);
       System.out.println("===========================");

       // deposit
        System.out.println("Deposit: ");
        System.out.println("--------------------------");
        c1.depositFund(5000);
        System.out.println();
        c2.depositFund(2000,10);
        System.out.println();
        c3.depositFund(1000);
        System.out.println();
        c4.depositFund(4000,5);
        System.out.println("===========================");

        // display information
        System.out.println("Displaying Account Info: ");
        System.out.println("--------------------------");
       c1.display();
        System.out.println();
       c2.display();
        System.out.println();
       c3.display();
        System.out.println();
       c4.display();
        System.out.println();
    }
}
