package Service;

import nonService.*;

public final class DaysStats {

    private final Cashbox cashbox;
    private final Admin admin;
    private final Waiter waiter;
    private final Cafe cafe;
    private int profit;
    private int orders;
    private boolean bankrupt;

    public DaysStats(Cashbox cashbox, Admin admin, Waiter waiter, Cafe cafe){
        this.admin = admin;
        this.cashbox = cashbox;
        this.cafe = cafe;
        this.waiter = waiter;
        this.bankrupt = false;
    }

    public void dayResult(Orders orders) {
        profit = cashbox.getDayProfit() - cafe.getBills() - admin.getSalary() - waiter.getSalary();
        this.orders = orders.getOrder().size();
        orders.getOrder().clear();
        cashbox.endDay();
        cashbox.setTotalMoney(profit);
        waiter.notBusy();
    }

    public boolean canOpen(){
        if(cashbox.getTotalMoney() < 0){
            bankrupt = true;
        }
        return bankrupt;
    }

    @Override
    public String toString() {
        if(canOpen())
            return "Cafe is closed forever. You can visit our others projected";

        if (admin.getIsInfested())
            return "Cafe is temporarily closed for Quarantine because Admin had Virus " + endDay();

        return "\nWe are closed. Come tomorrow." + endDay();
    }

    public String endDay(){
        return "\nToday was served " + orders + " orders.\n" +"Days profit is " + profit
                + ". Currently money on BankAccount: " + cashbox.getTotalMoney() + "\n\n";
    }
}
