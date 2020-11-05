package nonService;

import java.util.ArrayList;
import java.util.List;

public final class Cafe {

    private int numFreeTables;
    private final List<Table> tables;
    private int bills;
    private boolean quarantine;

    public Cafe(int FreeTableAmount, int bills) {
        this.numFreeTables = FreeTableAmount;
        this.bills = bills;
        this.quarantine = false;
        tables = new ArrayList<>();
    }

    public void addTable(int numPlace) {
        this.tables.add(new Table(numPlace));
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setNumFreeTables(int numTables) {
        this.numFreeTables = numTables;
    }

    public int getNumFreeTables() {
        return numFreeTables;
    }

    public void clientIn() {
        numFreeTables = numFreeTables - 1;
    }

    public void clientOut() {
        numFreeTables = numFreeTables + 1;
    }

    public void changeBills(int bills){
        this.bills += bills;
    }

    public int getBills(){
        return bills;
    }

    public void quarantineHasStarted(){
        this.quarantine = true;
    }

    public boolean getQuarantine(){
        return quarantine;
    }
}

