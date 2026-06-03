package Liskov_Substitution_Principle.LSP_followed;

import java.util.ArrayList;
import java.util.List;

public class LSP_followed {
    public static void main(String[] args) {

        List<WithdrawalOnlyAccount> withdrawalOnlyAccounts=new ArrayList<>();
        withdrawalOnlyAccounts.add(new SavingAccount(0));
        withdrawalOnlyAccounts.add(new CurrentAccount(0));

        List<DepositOnlyAccount> depositOnlyAccounts=new ArrayList<>();
        depositOnlyAccounts.add(new FixedTermAccount(0));

        ClientApplication app=new ClientApplication(depositOnlyAccounts,withdrawalOnlyAccounts);
        app.performTransaction();
    }
}
