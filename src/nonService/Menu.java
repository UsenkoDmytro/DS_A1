package nonService;

public enum Menu{
    Pizza("Pizza", 45),
    Spaghetti("Spaghetti", 40),
    Salad("Salad", 35),
    WineG("Glass of wine", 25),
    WineB("Bottle of wine", 65);


    private final String name;
    private final int price;

    Menu(String name, int price ){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
