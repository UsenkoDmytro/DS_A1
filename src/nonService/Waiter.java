package nonService;

public final class Waiter {
    private boolean busy;
    private final int salary;
    private final String name;

    public Waiter(int salary, String name){
        this.salary = salary;
        this.name = name;
    }

    public void isBusy(){
        busy = true;
    }

    public void notBusy(){
        busy = false;
    }

    public boolean getBusy(){
        return busy;
    }

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
}
