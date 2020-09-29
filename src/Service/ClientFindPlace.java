package Service;

import nonService.Cafe;
import nonService.Client;

public final class ClientFindPlace {

    private Cafe cafe;
    private boolean FoundAPlace;

    public ClientFindPlace(Cafe cafe){
        this.cafe = cafe;
    }

    public void ClientTryFindSit(Client client){
        FoundAPlace = false;
        if(cafe.getFreeTableAmount() != 0 && !client.getIsBusy()) {
            cafe.ClientIn();
            FoundAPlace = true;
        }
    }

    @Override
    public String toString() {
        if(FoundAPlace)
            return  "Client take a sit";
        else
            return  "Client take order away";
    }
}
