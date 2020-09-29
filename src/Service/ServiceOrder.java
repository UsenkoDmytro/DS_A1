package Service;

import nonService.Client;
import nonService.Menu;
import nonService.SelfCheckout;

public final class ServiceOrder {

    private final Menu menu;

    public ServiceOrder(Menu menu){
        this.menu = menu;
    }

    public void OrderMade(Client client, SelfCheckout selfCheckout){
        selfCheckout.PaymentForOrder(menu.getPrice());
    }

    @Override
    public String toString() {
        return "Client bought " + menu.getName() + " for " + menu.getPrice();
    }

}