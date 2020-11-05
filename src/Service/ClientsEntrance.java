package Service;

import nonService.*;


public final class ClientsEntrance {

    private final Cafe cafe;
    private final Admin admin;
    private boolean canEnter;
    private boolean findPlace;

    public ClientsEntrance(Cafe cafe, Admin admin){
        this.cafe = cafe;
        this.admin = admin;
        this.canEnter = true;
        this.findPlace = true;
    }

    public void canClientsEnter(Clients clients) {
        canEnter = true;
        if(cafe.getQuarantine()){
            for (Integer temp : clients.getTemperature()) {
                if (temp > 36) {
                    canEnter = false;
                    break;
                }
            }

            for (Integer temp : clients.getTemperature()) {
                if (temp == 36 || clients.getNumClients() <= 2) {
                    break;
                }
                if(!admin.getIsInfested()) {
                    admin.isInfested();
                    System.out.println("Admin looks sick. Maybe get infested...");
                }
            }
        }
    }

    public void clientsTryFindTable(Clients clients){
        if(cafe.getNumFreeTables() > 0) {
            for(Table table : cafe.getTables())
                if(table.getFree() && table.getNumPlace() >= clients.getNumClients()) {
                    clientsFindTable(clients, table);
                    break;
                }
        }
    }

    private void clientsFindTable(Clients clients, Table table) {
        table.setTaken();
        cafe.clientIn();
        clients.setTableId(table.getTableId());
        findPlace = true;
    }

    @Override
    public String toString() {
        if(canEnter && findPlace) {
            findPlace = false;
            return clientsFindTable();
        }
        else{
            findPlace = false;
            return clientsGoAway();
        }
    }

    public String clientsFindTable(){
        return "\nClients come in and there is fine place to seat";
    }

    public String clientsGoAway(){
        if(cafe.getQuarantine() && !canEnter)
            return "\nClients have high temperature so they cant come in. They walk away.";
        else
            return  "\nThere is no place to seat for this group of people, so they walk away.\n";
    }
}
