package Liskov_Substitution_Principle.LSP_followed_wrongly;

import java.util.List;

public class ClientApplication {

    List<Account> accounts;

    ClientApplication(List<Account> accounts){
        this.accounts=accounts;
    }


    void performTransaction(){

        for(Account acc : accounts){

            if(acc instanceof FixedTermAccount){
                acc.deposit(500);
                System.out.println("Skipping Withdrawal Transaction for Fixed Term Account");
            }else {
                try{
                    acc.deposit(1000);
                    acc.withdraw(500);
                } catch (UnsupportedOperationException e) {
                    throw new UnsupportedOperationException(e.getMessage());
                }
            }

        }
    }

}
