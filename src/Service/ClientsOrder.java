package Service;

import nonService.*;

import java.util.ArrayList;
import java.util.Collections;



public final class ClientsOrder {

    private final Orders orders;
    private final Cafe cafe;

    public ClientsOrder(Cafe cafe, Orders orders) {
        this.orders = orders;
        this.cafe = cafe;
    }

   public void clientsMakeOrder(Waiter waiter, Clients clients, Menu ... Dishes) {
        soMuchClients(waiter);
        Order order = new Order(waiter);
        clients.setOrderId(order.getOrderId());

        ArrayList<Menu> DishesList = new ArrayList<>();
        Collections.addAll(DishesList, Dishes);
        order.newDish(DishesList);

        orders.addOrder(order);
    }

    public void soMuchClients(Waiter waiter) {
        if(!cafe.getQuarantine()){
            if (cafe.getNumFreeTables() <= 2)
                waiter.isBusy();
            else
                waiter.notBusy();
        }
    }

    @Override
    public String toString() {
        return "Clients have ordered a dishes and receive it. Clients order is:\n" +
                    ordersInfo(orders.getOrder().
                            get(orders.getOrder().size() - 1)
                    );
        }


    public String ordersInfo(Order order) {
        return "\tOrder: " + order.getOrderId()
                + "\n\tWaiter: " + order.getWaiter().getName()
                + "\n\tDishes: " + order.getDishes()
                + "\n\tTotal cost: " + order.getTotalCost();
    }
}