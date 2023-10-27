package lista_3.zadanie_1;


public class Plywood implements Product{
    private final int quantity;

    public Plywood(int quantity, PlywoodElement... elements) {
        this.quantity = quantity;
        int check = 100;
        for (PlywoodElement i: elements){
            check =- i.getPercentage();
        }
        if (check != 100){
            throw new IllegalArgumentException();
        }

    }

    @Override
    public String getName() {
        String name;
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public int getQuantity() {
        return 0;
    }
}
