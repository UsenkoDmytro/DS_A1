import nonService.*;
import Service.*;


public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe(6, 300);
        Admin admin = new Admin(120);
        Waiter waiter = new Waiter(70, "John");
        Cashbox cashbox = new Cashbox(700);
        Orders orders = new Orders();

        cafe.addTable(2);
        cafe.addTable(2);
        cafe.addTable(2);
        cafe.addTable(5);
        cafe.addTable(5);
        cafe.addTable(5);

        ClientsEntrance clientsEntrance = new ClientsEntrance(cafe, admin);
        ClientsExit clientsExit = new ClientsExit(cafe, cashbox, orders);
        DaysStats daysStats = new DaysStats(cashbox, admin, waiter, cafe);

        System.out.println("Cafe is open and wait for new clients");

        Clients clients1 = new Clients(2);
        clientsEntrance.canClientsEnter(clients1);
        clientsEntrance.clientsTryFindTable(clients1);
        System.out.println(clientsEntrance.toString());

        ClientsOrder clientsOrder1 = new ClientsOrder(cafe, orders);
        clientsOrder1.clientsMakeOrder(waiter, clients1, Menu.Pizza, Menu.Salad, Menu.WineB);
        System.out.println(clientsOrder1.toString());


        clientsExit.clientsPayForOrder(clients1);
        clientsExit.clientsGoAway(clients1);
        System.out.println(clientsExit.toString());


        Clients clients2 = new Clients(10);
        clientsEntrance.canClientsEnter(clients2);
        clientsEntrance.clientsTryFindTable(clients2);
        System.out.println(clientsEntrance.toString());


        Clients clients3 = new Clients(4);
        clientsEntrance.canClientsEnter(clients3);
        clientsEntrance.clientsTryFindTable(clients3);
        System.out.println(clientsEntrance.toString());
        ClientsOrder clientsOrder3 = new ClientsOrder(cafe, orders);
        clientsOrder3.clientsMakeOrder(waiter, clients3, Menu.Spaghetti);
        System.out.println(clientsOrder3.toString());

        Clients clients4 = new Clients(4);
        clientsEntrance.canClientsEnter(clients4);
        clientsEntrance.clientsTryFindTable(clients4);
        System.out.println(clientsEntrance.toString());
        ClientsOrder clientsOrder4 = new ClientsOrder(cafe, orders);
        clientsOrder4.clientsMakeOrder(waiter, clients4, Menu.Pizza, Menu.WineG);
        System.out.println(clientsOrder4.toString());


        Clients clients5 = new Clients(3);
        clientsEntrance.canClientsEnter(clients5);
        clientsEntrance.clientsTryFindTable(clients5);
        System.out.println(clientsEntrance.toString());
        ClientsOrder clientsOrder5 = new ClientsOrder(cafe, orders);
        clientsOrder5.clientsMakeOrder(waiter, clients5, Menu.Salad);
        System.out.println(clientsOrder5.toString());

        Clients clients6 = new Clients(2);
        clientsEntrance.canClientsEnter(clients6);
        clientsEntrance.clientsTryFindTable(clients6);
        System.out.println(clientsEntrance.toString());
        ClientsOrder clientsOrder6 = new ClientsOrder(cafe, orders);
        clientsOrder6.clientsMakeOrder(waiter, clients6, Menu.Pizza);
        System.out.println(clientsOrder6.toString());


        Clients clients7 = new Clients(1);
        clientsEntrance.canClientsEnter(clients7);
        clientsEntrance.clientsTryFindTable(clients7);
        System.out.println(clientsEntrance.toString());
        ClientsOrder clientsOrder7 = new ClientsOrder(cafe, orders);
        clientsOrder7.clientsMakeOrder(waiter, clients7, Menu.Pizza, Menu.Salad, Menu.WineB);
        System.out.println(clientsOrder7.toString());


        clientsExit.clientsPayForOrder(clients3);
        clientsExit.clientsGoAway(clients3);
        System.out.println(clientsExit.toString());

        clientsExit.clientsPayForOrder(clients4);
        clientsExit.clientsGoAway(clients4);
        System.out.println(clientsExit.toString());

        clientsExit.clientsPayForOrder(clients5);
        clientsExit.clientsGoAway(clients5);
        System.out.println(clientsExit.toString());

        clientsExit.clientsPayForOrder(clients6);
        clientsExit.clientsGoAway(clients6);
        System.out.println(clientsExit.toString());

        clientsExit.clientsPayForOrder(clients7);
        clientsExit.clientsGoAway(clients7);
        System.out.println(clientsExit.toString());



        daysStats.dayResult(orders);
        daysStats.canOpen();
        System.out.println(daysStats.toString());


        System.out.println("Second day is started");
        QuarantineStarted quarantineStarted = new QuarantineStarted(cafe);
        quarantineStarted.quarantineBills(100);
        quarantineStarted.quarantineTables(3);
        System.out.println(quarantineStarted.toString());

        Clients clients10 = new Clients(3, 36, 37, 36);
        clientsEntrance.canClientsEnter(clients10);
        System.out.println(clientsEntrance.toString());

        Clients clients11 = new Clients(6, 36, 36, 36, 36, 36, 36);
        clientsEntrance.canClientsEnter(clients11);
        System.out.println(clientsEntrance.toString());


        Clients clients12 = new Clients(3, 36,36,36);
        clientsEntrance.canClientsEnter(clients12);
        clientsEntrance.clientsTryFindTable(clients12);
        System.out.println(clientsEntrance.toString());
        ClientsOrder clientsOrder12 = new ClientsOrder(cafe, orders);
        clientsOrder12.clientsMakeOrder(waiter, clients12, Menu.Pizza, Menu.Salad, Menu.WineB, Menu.Spaghetti);
        System.out.println(clientsOrder12.toString());
        clientsExit.clientsPayForOrder(clients12);
        clientsExit.clientsGoAway(clients12);
        System.out.println(clientsExit.toString());


        daysStats.dayResult(orders);
        daysStats.canOpen();
        System.out.println(daysStats.toString());

        System.out.println("Third day. Cafe still closed, but bills and salary are coming");
        daysStats.dayResult(orders);
        daysStats.canOpen();
        System.out.println(daysStats.toString());
    }
}
