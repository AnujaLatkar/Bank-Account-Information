public class bankAccount {

    String name;
    double balance;
    int accountno;
    double ammount;

    public bankAccount(String name, int accountno, double balance) {

        this.name = name;
        this.accountno = accountno;
        this.balance = balance;
    }

    public void withdraw(double ammount) {

        balance = balance - ammount;
        System.out.println(ammount + " ammount withdrawn");

    }

    public void deposit(double ammount) {

        balance = balance + ammount;
        System.out.println(ammount + " ammount added to the account");

    }

    public void showBalance() {

        System.out.println("Balance = " + balance);

    }

    static class SavingAccount extends bankAccount {

        private int rate;

        public SavingAccount(String name, int accountno, double balance, int rate) {
            super(name, accountno, balance);
            this.rate = rate;
        }

        public static void main(String[] args) {
            SavingAccount s1 = new SavingAccount("Anuja", 1234, 40000, 10);
            s1.with_Interest();

            // bankAccount bank1= new bankAccount("Anuja",1234,40000);
            s1.showBalance();
            s1.deposit(1000);
            s1.showBalance();
            s1.withdraw(100);
            s1.showBalance();
        }

        public void with_Interest() {

            double interest;
            interest = (balance * rate) / 100;
            deposit(interest);
            System.out.println("Balance in Savings account= " + balance);
        }

    }

}