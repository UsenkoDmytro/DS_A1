package nonService;

import java.util.Collections;
import java.util.ArrayList;
import java.util.UUID;

public final class Clients {

    private final int numClients;
    private ArrayList<Integer> temperature;
    private UUID tableId;
    private UUID orderId;

    public Clients(int numClients) {
        this.numClients = numClients;
    }

   public Clients(int numClients, Integer ... temperature) {
        this.numClients = numClients;
        this.temperature = new ArrayList<>();
        Collections.addAll(this.temperature, temperature);
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public int getNumClients(){
        return numClients;
    }

    public ArrayList<Integer> getTemperature(){
        return temperature;
    }

    public void setTableId(UUID tableId) {
        this.tableId = tableId;
    }

    public UUID getTableId() {
        return tableId;
    }

}



