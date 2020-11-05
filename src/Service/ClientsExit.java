package Service;

import nonService.*;

public final class ClientsExit {

    private final Cafe cafe;
    private final Cashbox cashbox;
    private final Orders orders;
    private boolean tips;


    public ClientsExit(Cafe cafe, Cashbox cashbox, Orders orders){
        this.cafe = cafe;
        this.cashbox = cashbox;
        this.orders = orders;
    }

    public void clientsPayForOrder(Clients clients){
        for (Order order : orders.getOrder()){
            if(clients.getOrderId() == order.getOrderId()){
                cashbox.paymentForOrder(order.getTotalCost());
                tips = !order.getOrderSpeed();
                break;
            }
        }
    }

    public void clientsGoAway(Clients clients){
        for (Table table: cafe.getTables())
            if (clients.getTableId() == table.getTableId()){
                table.setFree();
                cafe.clientOut();
            }
    }

    @Override
    public String toString() {
        if(tips) {
            return "Clients were satisfied and left some tips. Clients walk away";
        }
        return  "Waiter was slow due to high load, so clients didnt leave some tips. Clients go away";
    }
}
