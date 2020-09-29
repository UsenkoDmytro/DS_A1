package nonService;



public final class Cafe {

    private int FreeTableAmount;
    private int bills;
    private int BankAccount;

    public Cafe(int FreeTableAmount, int bills) {
        this.FreeTableAmount = FreeTableAmount;
        this.bills = bills;
        this.BankAccount = 1000;
             }

    public int getFreeTableAmount() {
        return FreeTableAmount;
    }

    public void setQuarantineTableAmount() {
        FreeTableAmount /=  2;
    }

    public void ClientIn() {
        FreeTableAmount--;
    }

    public void ClientOut() {
        FreeTableAmount++;
    }

    public void setBills(int bills){
        this.bills += bills;
    }

    public int getBills(){
        return bills;
    }

    public int getBankAccount(){
        return BankAccount;
    }

    public void setBankAccount(int profit){
        this.BankAccount += profit;
    }

}

