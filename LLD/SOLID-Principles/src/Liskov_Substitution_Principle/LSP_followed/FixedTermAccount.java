package Liskov_Substitution_Principle.LSP_followed;

public class FixedTermAccount implements DepositOnlyAccount{

    private double balance;

    FixedTermAccount(double balance){
        this.balance=balance;
    }

    @Override
    public void deposit(double amt) {
        balance+=amt;
        System.out.println("Deposited $"+amt+" in your "+getClass().getName());
        System.out.println("Balance : "+balance);
    }

}
