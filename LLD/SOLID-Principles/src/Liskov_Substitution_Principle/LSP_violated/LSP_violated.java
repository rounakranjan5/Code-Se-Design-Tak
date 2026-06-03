package Liskov_Substitution_Principle.LSP_violated;

import java.util.ArrayList;
import java.util.List;

public class LSP_violated {

    public static void main(String[] args) {
        List<Account> accounts=new ArrayList<>();
        accounts.add(new SavingsAccount(0));
        accounts.add(new CurrentAccount(0));
        accounts.add(new FixedTermAccount(0));

        ClientApplication app=new ClientApplication(accounts);
        app.performTransaction();
    }

}
