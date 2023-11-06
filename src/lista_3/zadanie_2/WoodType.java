package lista_3.zadanie_2;

public enum WoodType {
    Oak(250),
    Walnut(300) ,
    Pine(240),
    Ash(500),
    Redwood(325),
    Beech(987),
    Mahogany(1250);

    public final int price;

    private WoodType(int price) {
        this.price = price;
    }
}
