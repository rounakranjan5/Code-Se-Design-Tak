package Liskov_Substitution_Principle.LSP_violated;

import java.util.List;

public class ClientApplication {

    private List<Account>accounts;

    ClientApplication(List<Account> accounts){
        this.accounts=accounts;
    }

    void performTransaction(){
        for(Account acc : accounts){
            acc.deposit(1000);

            try{
                acc.withdraw(500);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

}
