import nonService.*;
import Service.*;


public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe(2, 10);
        Admin admin = new Admin(5);
        Quarantine quarantine = new Quarantine();
        SelfCheckout selfCheckout = new SelfCheckout();

        ClientEntrance clientEntrance = new ClientEntrance(admin, quarantine);
        ClientFindPlace clientFindPlace = new ClientFindPlace(cafe);
        ClientExit clientExit = new ClientExit(cafe);
        DaysStats daysStats = new DaysStats(selfCheckout, admin, cafe);




        System.out.println("We open our Cafe\n\n");




        Client client1 = new Client(false,37, false);
        clientEntrance.CanClientEnter(client1);
        System.out.println(clientEntrance.toString());

        ServiceOrder serviceOrder1 = new ServiceOrder(Menu.Burger);
        serviceOrder1.OrderMade(client1, selfCheckout);
        System.out.println(serviceOrder1.toString());

        clientFindPlace.ClientTryFindSit(client1);
        System.out.println(clientFindPlace.toString());


        Client client2 = new Client(true,37, false);
        clientEntrance.CanClientEnter(client2);
        System.out.println(clientEntrance.toString());

        ServiceOrder serviceOrder2 = new ServiceOrder(Menu.BurgerXL);
        serviceOrder2.OrderMade(client2, selfCheckout);
        System.out.println(serviceOrder1.toString());

        clientFindPlace.ClientTryFindSit(client2);
        System.out.println(clientFindPlace.toString());

        clientExit.ClintGoAway(client1);
        System.out.println(clientExit.toString());


        daysStats.Profit();
        System.out.println(daysStats.toString());





        System.out.println("Another day is started\n");
        QuarantineStarted quarantineStarted = new QuarantineStarted(quarantine, cafe, admin);
        System.out.println(quarantineStarted.toString());


        Client client3 = new Client(false,36, true);
        clientEntrance.CanClientEnter(client3);
        System.out.println(clientEntrance.toString());

        ServiceOrder serviceOrder3 = new ServiceOrder(Menu.Vegan);
        serviceOrder3.OrderMade(client3, selfCheckout);
        System.out.println(serviceOrder3.toString());

        clientFindPlace.ClientTryFindSit(client3);
        System.out.println(clientFindPlace.toString());


        Client client4 = new Client(false,36, true);
        clientEntrance.CanClientEnter(client4);
        System.out.println(clientEntrance.toString());

        ServiceOrder serviceOrder4 = new ServiceOrder(Menu.Chicken);
        serviceOrder4.OrderMade(client4, selfCheckout);
        System.out.println(serviceOrder4.toString());

        clientFindPlace.ClientTryFindSit(client4);
        System.out.println(clientFindPlace.toString());


        Client client5 = new Client(false,36, false);
        clientEntrance.CanClientEnter(client5);
        System.out.println(clientEntrance.toString());

        Client client6 = new Client(false,38, false);
        clientEntrance.CanClientEnter(client6);
        System.out.println(clientEntrance.toString());

        Client client7 = new Client(false,38, true);
        clientEntrance.CanClientEnter(client7);
        System.out.println(clientEntrance.toString());


        clientExit.ClintGoAway(client3);
        System.out.println(clientExit.toString());
        clientExit.ClintGoAway(client4);
        System.out.println(clientExit.toString());


        daysStats.Profit();
        System.out.println(daysStats.toString());

        System.out.println("Another day started, but...");
        System.out.println(quarantineStarted.toString());
    }
}
