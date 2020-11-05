package nonService;

public final class Admin {

    private boolean isInfested;
    private final int salary;

    public Admin(int salary){
        isInfested = false;
        this.salary = salary;
    }

    public void isInfested(){
        isInfested = true;
    }

    public void isRecovered(){
        isInfested = false;
    }

    public boolean getIsInfested(){
        return isInfested;
    }

    public int getSalary(){
        return salary;
    }
}
