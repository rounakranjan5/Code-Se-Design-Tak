package Liskov_Substitution_Principle.LSP_violated;

public class FixedTermAccount implements Account {
    private double balance;

    FixedTermAccount(double balance){
        this.balance=balance;
    }

    @Override
    public void deposit(double amt) {
        balance+=amt;
        System.out.println("Withdrawl Successfull of $"+amt+" from "+getClass().getName());
        System.out.println("--- Current balance : "+balance+" ---");
    }

    @Override
    public void withdraw(double amt) {
        throw new UnsupportedOperationException("Withdrawl is Not allowed for fixed term accounts");
    }
}
