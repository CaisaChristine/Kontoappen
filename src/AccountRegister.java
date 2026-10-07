import java.util.ArrayList;
import java.util.List;

public class AccountRegister {

    private List<Account> accounts = new ArrayList<>();

    public void printAll() {
    }

    public Account findAccount(String owner) {
        for (int i  = 0; i < accounts.size(); i++) {
            Account a =  accounts.get(i);
            if (a.getOwner().equalsIgnoreCase(owner)) {
                return a;
            }
        } return null;
    }

    public void createAccount(String owner, double initialBalance) {
        Account account = new Account(owner, initialBalance);
        accounts.add(account);
    }
}
