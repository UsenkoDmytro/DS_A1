package nonService;

public final class Quarantine {

    private boolean quarantine;

    public Quarantine(){
        quarantine = false;
    }

    public void QuarantineHasStarted(){
        quarantine = true;
    }

    public boolean getQuarantine(){
        return quarantine;
    }

}
