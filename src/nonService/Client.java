package nonService;

public final class Client {

    private final boolean isBusy;
    private final int temperature;
    private final boolean isMask;

    public Client(boolean isBusy, int temperature, boolean isMask) {
        this.isBusy = isBusy;
        this.temperature = temperature;
        this.isMask = isMask;
    }

    public boolean getIsBusy(){
        return isBusy;
    }
    public int getTemperature(){
        return temperature;
    }
    public boolean getMask() {
        return isMask;
    }



}



