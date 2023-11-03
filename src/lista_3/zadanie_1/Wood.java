package lista_3.zadanie_1;

public class Wood implements Product {
    private final double length;
    private final double width;
    private final double height;
    private final double pricePerMeter;
    private final int quantity;
    private final WoodType type;


    /**
     * @param length długość deski
     * @param width szerokość deski
     * @param height wysokości deski
     * @param quantity liczba sztuk danej deski
     * @param type typ drewna, z jakiego zrobiona jest deska
     */
    public Wood(double length, double width, double height, int quantity, WoodType type) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.pricePerMeter = type.price;
        this.quantity = quantity;
        this.type = type;
    }

    @Override
    public String getName() {
        return length + "x" + width +"x" + height; // why
    }

    @Override
    public double getPrice() {
        return length*width*height*pricePerMeter;
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
     * @return Typ drewna deski
     */
    public WoodType getType(){
        return this.type;
    }

    /**
     * @return powierzchnia deski
     */
    public double area(){
        return length*width;
    }




}
