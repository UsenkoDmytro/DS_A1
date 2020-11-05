package Service;

import nonService.*;

public final class QuarantineStarted {

    private final Cafe cafe;

    public QuarantineStarted(Cafe cafe){
        this.cafe = cafe;
        this.cafe.quarantineHasStarted();
    }

    public void quarantineBills(int bills){
        cafe.changeBills(bills);
        System.out.println("Due to quarantine mode bills are increased on " + bills);
    }

    public void quarantineTables(int numTables){
        cafe.setNumFreeTables(numTables);
        System.out.println("The number of tables has been reduced by half " +
                            "due to the quarantine restriction");
    }

    @Override
    public String toString() {
       return "Cafe working in Quarantine mode\n\n";
    }
}
