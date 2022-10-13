public class Main {
    public static void main(String[] args) {
        Account savAcc = new SavingsAccount(101, 1500);
        Account creditAcc = new CreditAccount(102, 1000);
        Account checkAcc = new CheckingAccount(103, 2000);
        System.out.println("Открыт сберегательный счет № " + savAcc.getId() + " сумма " + savAcc.getBalance());
        System.out.println("Открыт кредитный счет № " + creditAcc.getId() + " сумма " + creditAcc.getBalance());
        System.out.println("Открыт расчетный счет № " + checkAcc.getId() + " сумма " + checkAcc.getBalance());
        checkAcc.transfer(creditAcc, 200);
        creditAcc.transfer(savAcc, 400);
        savAcc.transfer(checkAcc, 100);
        checkAcc.pay(100);
        creditAcc.pay(200);
        savAcc.pay(100);
        creditAcc.addMoney(1000);
        savAcc.addMoney(1500);
        checkAcc.addMoney(2000);
    }
}
