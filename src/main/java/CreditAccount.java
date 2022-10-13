public class CreditAccount extends Account {
    CreditAccount(int id, int first) {
        super(id, first * -1);
    }

    @Override
    public void pay(int amount) {
        super.pay(amount * -1);
    }

    @Override
    public void transfer(Account account, int amount) {
        super.transfer(account, amount);
    }

}
