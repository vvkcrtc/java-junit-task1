public abstract class Account {
    int balance = 0;
    int accountId = 0;

    Account(int id, int first) {
        accountId = id;
        balance = first;
    }

    public int getId() {
        return accountId;
    }

    public int getBalance() {
        return balance;
    }

    public void pay(int amount) {
        balance -= amount;
        System.out.println("Счет : " + accountId + " Операция оплаты на сумму : " + amount + " , Баланс : " + balance);
    }

    ;

    public void addMoney(int amount) {
        balance += amount;
        System.out.println("Счет : " + accountId + " Операция пополнения счета на сумму : " + amount + " , Баланс : " + balance);
    }

    public void transfer(Account account, int amount) {
        account.addMoney(amount);
        balance -= amount;
        System.out.println("Счет : " + accountId + " Операция перевода на счет : " + account.getId() + " в размере : " + amount + " , Баланс : " + balance);

    }

    ;
}
