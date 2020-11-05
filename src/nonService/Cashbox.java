package nonService;

public final class Cashbox{

    private int dayProfit;
    private int totalMoney;

    public Cashbox(int totalMoney){
        dayProfit = 0;
        this.totalMoney = totalMoney;
    }

    public void paymentForOrder(int payment){
        dayProfit += payment;
    }

    public int getDayProfit(){
        return dayProfit;
    }

    public void endDay(){
        dayProfit = 0;
    }

    public int getTotalMoney(){
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney){
        this.totalMoney += totalMoney;
    }

}
