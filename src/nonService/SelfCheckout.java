package nonService;

public final class SelfCheckout{


    private int DayProfit;

    public SelfCheckout(){
        this.DayProfit = 0;
    }

    public void PaymentForOrder(int payment){
        DayProfit += payment;
    }

    public int getDayProfit(){
        return DayProfit;
    }
    public void setDayProfit(int DayProfit){
        this.DayProfit = DayProfit;
    }

}
