package Liskov_Substitution_Principle.LSP_followed_wrongly;

public class FixedTermAccount implements Account{

    private double balance;

    public FixedTermAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amt) {
        balance+=amt;
        System.out.println("Deposited $"+amt+" in your "+getClass().getName());
        System.out.println("Balance : "+balance);
    }

    @Override
    public void withdraw(double amt) {
        throw new UnsupportedOperationException("Withdrawal is Not Supported in Fixed Term Accounts");
    }
}
