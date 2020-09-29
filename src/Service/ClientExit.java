package Service;

import nonService.Cafe;
import nonService.Client;

public final class ClientExit {

    private Cafe cafe;

    public ClientExit(Cafe cafe){
        this.cafe = cafe;
    }

    public void ClintGoAway(Client client){
        cafe.ClientOut();
    }

    @Override
    public String toString() {
        return "Client go away";
    }
}
