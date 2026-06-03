package Liskov_Substitution_Principle.LSP_followed;

public interface WithdrawalOnlyAccount extends DepositOnlyAccount{
    void withdraw(double amt);
}
