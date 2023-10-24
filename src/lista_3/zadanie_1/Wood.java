package lista_3.zadanie_1;

public class Wood implements Product {
    private final double length;
    private final double width;
    private final double height;
    private final double pricePerMeter; // Can do better?
    private int quantity;



    public Wood(double length, double width, double height, double pricePerMeter, int quantity) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.pricePerMeter = pricePerMeter;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return String.valueOf(length) + 'x' + width +'x' + height; // why
    }

    @Override
    public double getPrice() {
        return length*width*height*pricePerMeter;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
    public double area(){
        return length*width;
    }

    public void sale(int quantity){
        this.quantity =- quantity;
    }
    //??????


}
