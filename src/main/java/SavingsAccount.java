public class SavingsAccount extends Account {

    SavingsAccount(int id, int first) {
        super(id, first);
    }
    @Override
    public void pay(int amount){
        System.out.println("Оплата недоступна");
    }
    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Перевод недоступен");
    }
}
