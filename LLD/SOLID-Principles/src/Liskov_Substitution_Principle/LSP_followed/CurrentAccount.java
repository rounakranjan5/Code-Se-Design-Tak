package Liskov_Substitution_Principle.LSP_followed;

public class CurrentAccount implements WithdrawalOnlyAccount {

    private double balance;

    CurrentAccount(double balance){
        this.balance=balance;
    }

    @Override
    public void deposit(double amt) {
        balance+=amt;
        System.out.println("Deposited $"+amt+" in your "+getClass().getName());
        System.out.println("Balance : "+balance);
    }

    @Override
    public void withdraw(double amt) {
        if (balance>=amt){
            balance-=amt;
            System.out.println("Withdrawal of $"+amt+" from your "+getClass().getName()+" is successfull");
            System.out.println("Balance : "+balance);
        }else{
            System.out.println("Insufficient Balance...");
        }
    }
}
