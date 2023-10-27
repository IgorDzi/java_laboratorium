package lista_3.zadanie_1;

public class Furniture implements Product{
    private final String name;
    private final double price;
    private final int yearOfProduction;
    private int quantity;


    public Furniture(String name, double price, int yearOfProduction, int quantity, WoodType WoodType) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.quantity = quantity;
        if (isVintage()){
            this.price = WoodType.price + 0.2*price;
        }
        else {
            this.price = WoodType.price;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
    public void sale(int quantity) {
        this.quantity = -quantity;
    }
    public String getInfo(){
        return name + "Produced in: " + yearOfProduction + vintageStatus();
    }
    private boolean isVintage(){
        return yearOfProduction < 1980;
    }
    private String vintageStatus(){
        if (isVintage()){
            return "VINTAGE";
        }
        else {
            return "NOT VINTAGE";
        }
    }
}
