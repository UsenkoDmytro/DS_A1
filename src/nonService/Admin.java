package nonService;

public final class Admin {

    private boolean isInfested;
    private final int salary;

    public Admin(int salary){
        isInfested = false;
        this.salary = salary;
    }

    public void setIsInfested(){
        isInfested = true;
    }

    public boolean getIsInfested(){
        return isInfested;
    }

    public int GetSalary(){
        return salary;
    }
}
