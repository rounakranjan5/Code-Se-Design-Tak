package Liskov_Substitution_Principle.LSP_violated;

public class CurrentAccount implements Account {

    private double balance;

    CurrentAccount(double balance){
        this.balance=balance;
    }

    @Override
    public void deposit(double amt) {
        balance+=amt;
        System.out.println("deposited $"+amt+" successfully!! in "+getClass().getName());
        System.out.println("--- Current balance : "+balance+" ---");
    }

    @Override
    public void withdraw(double amt) {
        if(amt<=balance){
            balance-=amt;
            System.out.println("Withdrawl Successfull of $"+amt+" from "+getClass().getName());
            System.out.println("--- Current balance : "+balance+" ---");
        }else{
            throw new RuntimeException("Insufficient Balance");
        }
    }
}
