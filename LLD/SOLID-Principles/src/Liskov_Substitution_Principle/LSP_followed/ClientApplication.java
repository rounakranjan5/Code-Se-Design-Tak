package Liskov_Substitution_Principle.LSP_followed;

import java.util.List;

public class ClientApplication {

    List<DepositOnlyAccount> depAccounts;
    List<WithdrawalOnlyAccount> wdrAccounts;

    ClientApplication(List<DepositOnlyAccount> depAccounts,List<WithdrawalOnlyAccount> wdrAccounts){
        this.depAccounts=depAccounts;
        this.wdrAccounts=wdrAccounts;
    }

    void performTransaction(){
        for(DepositOnlyAccount acc : depAccounts){
            acc.deposit(1000);
        }
        for (WithdrawalOnlyAccount acc : wdrAccounts){
            acc.deposit(1000);
            acc.withdraw(700);
        }
    }

}
