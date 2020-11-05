package nonService;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public final class Order {

    private List<Menu> orderedDishes;
    private final Waiter waiter;
    private int totalCost;
    private final UUID orderId;
    private final boolean orderSpeed;

    public Order(Waiter waiter){
        this.waiter = waiter;
        orderedDishes = new ArrayList<>();
        orderId = UUID.randomUUID();
        this.orderSpeed = waiter.getBusy();
    }

    public void newDish(ArrayList<Menu> orderedDish){
        orderedDishes.addAll(orderedDish);
    }

    public int getTotalCost(){
        totalCost = 0;
        for (Menu orderedDish : orderedDishes) {
            totalCost += orderedDish.getPrice();
        }
        return totalCost;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public boolean getOrderSpeed(){
        return orderSpeed;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public List<String> getDishes(){
        List<String> dishes = new ArrayList<>();
        for (Menu orderedDish : orderedDishes) {
            dishes.add(orderedDish.getName());
        }
        return dishes;
    }
}
