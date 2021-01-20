public class BankAccount {
    String name;
    double balance;
    private static int uniqNum = 1000;  // static field variable
    int accNum;

    public BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
        this.accNum = uniqNum;
        uniqNum++;
    }

    public BankAccount(String name){
        this.name = name;
        this.balance = 0;
        this.accNum = uniqNum;
        uniqNum++;
    }

    void withDraw(double amt){

        if (this.balance > 0) {
            this.balance = this.balance - amt;
            System.out.println("Withdrawal of: " + amt + " is successful.");
        }
        else{
            System.out.println("No money in account to withdraw..");
        }
    }

    void withDraw(double amt, double fee){
        if (this.balance > 0){
            this.balance  = this.balance - amt - fee;
            System.out.println("Withdrawn amt: " + amt + " Fee: " + fee);
        }
        else{
            System.out.println("No money in account to withdraw..");
        }
    }

    void depositFund(double amt){
        this.balance = this.balance + amt;
        System.out.println("Deposited amount: "+amt);
    }

    void depositFund(double amt, double interest){
        double incr = interest/100 * amt;
        this.balance = this.balance + amt + incr;
        System.out.println("Deposited amount: "+ amt + "Interest added: " + incr);
    }

    void display(){
        System.out.println("Customer name: " + name);
        System.out.println("Account number: " + accNum);
        System.out.println("Balance: " + balance);

    }
}
