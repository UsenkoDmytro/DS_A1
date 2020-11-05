package nonService;

import java.util.UUID;

public final class Table {

    private boolean free;
    private final int numPlace;
    private final UUID tableId;

    public Table(int numPlace) {
        this.free = true;
        this.numPlace = numPlace;
        tableId = UUID.randomUUID();
    }

    public void setFree() {
        this.free = true;
    }

    public void setTaken() {
        this.free = false;
    }

    public UUID getTableId() {
        return tableId;
    }

    public boolean getFree() {
        return free;
    }

    public int getNumPlace() {
        return numPlace;
    }
}
