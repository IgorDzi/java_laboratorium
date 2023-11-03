package lista_3.zadanie_1;

public class Furniture implements Product{
    private final String name;
    private final double price;
    private final int yearOfProduction;
    private final int quantity;


    /**
     * @param name Nazwa produktu
     * @param price Cena produktu
     * @param yearOfProduction Rok produkcji produktu
     * @param quantity Ilość produktu na stanie
     * @param WoodType Typ drewna, z jakiego produkt jest wykonany
     */
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
    @Override
    public String toString(){
        return this.getName();
    }

    /**
     * @return Informacje na temat produktu
     */
    public String getInfo(){
        return name + "Produced in: " + yearOfProduction + vintageStatus();
    }

    /**
     * @return True: Przedmiot jest uznawany za "vintage" False: Przedmiot nie jest uznawany za "vintage"
     */
    private boolean isVintage(){
        return yearOfProduction < 1980;
    }

    /**
     * @return Informacja na temat statusu "vintage"
     */
    private String vintageStatus(){
        if (isVintage()){
            return "VINTAGE";
        }
        else {
            return "NOT VINTAGE";
        }
    }
}
