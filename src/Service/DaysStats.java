package Service;

import nonService.Admin;
import nonService.Cafe;
import nonService.SelfCheckout;

public final class DaysStats {

    private final SelfCheckout selfCheckout;
    private final Admin admin;
    private final Cafe cafe;
    private int profit;

    public DaysStats(SelfCheckout selfCheckout, Admin admin, Cafe cafe){
        this.admin = admin;
        this.selfCheckout = selfCheckout;
        this.cafe = cafe;
    }

    public void Profit() {
        profit = selfCheckout.getDayProfit() - cafe.getBills() - admin.GetSalary();
        cafe.setBankAccount(profit);
        selfCheckout.setDayProfit(0);
    }

    @Override
    public String toString() {
       return "We are closed, come tomorrow. Days profit is " + profit + ". Currently money on BankAccount: "
               + cafe.getBankAccount() + "\n\n";
    }
}
