package nonService;

public enum menu{
    Burger("Burger", 5),
    BurgerXL("BurgerXL", 7),
    Vegan("Vegan", 4),
    Chicken("Chicken", 6);

    private final String name;
    private final int price;

    menu(String name, int price ){
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
