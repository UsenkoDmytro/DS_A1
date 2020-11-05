package nonService;

import java.util.ArrayList;
import java.util.List;

public final class Orders {

    private final List<Order> orders;


    public Orders() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order newOrder) {
        orders.add(newOrder);
    }

    public List<Order> getOrder() {
        return orders;
    }

}
