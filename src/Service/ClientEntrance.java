package Service;


import nonService.Admin;
import nonService.Client;
import nonService.Quarantine;

public final class ClientEntrance {

    private boolean canEnter;
    private final Admin admin;
    private final Quarantine quarantine;

    public ClientEntrance(Admin admin, Quarantine quarantine){
        canEnter = true;
        this.admin = admin;
        this.quarantine = quarantine;
    }

    public void CanClientEnter(Client client) {
        canEnter = false;
        if (client.getMask() & client.getTemperature() < 37) {
            canEnter = true;
        }
        if (!client.getMask() & client.getTemperature() > 37){
            admin.setIsInfested();
        }
    }

    @Override
    public String toString() {

        if(!quarantine.getQuarantine())
            return ClientEnter();
        else {
            if (canEnter)
                return ClientEnter();
            else
                return ClientNotEnter();
        }


    }


    public String ClientEnter(){
        return "Client come in";
    }

    public String ClientNotEnter(){
        return "Client cant come";
    }
}
