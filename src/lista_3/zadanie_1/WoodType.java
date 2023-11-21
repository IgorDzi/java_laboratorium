package lista_3.zadanie_1;

public enum WoodType {
    OAK(250),
    WALNUT(300) ,
    PINE(240),
    ASH(500),
    Redwood(325),
    BEECH(987),
    MAHOGANY(1250);

    public final int price;

    WoodType(int price) {
        this.price = price;
    }
}
