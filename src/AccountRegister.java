import java.util.ArrayList;
import java.util.List;

public class AccountRegister {

    private List<Account> accounts = new ArrayList<>();

    public void printAll() {
    }

    public void createAccount(String owner, double initialBalance) {
        Account account = new Account(owner, initialBalance);
        accounts.add(account);
    }
}
