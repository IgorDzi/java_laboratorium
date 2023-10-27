package lista_3.zadanie_1;


import java.util.ArrayList;
import java.util.HashMap;

public class Plywood implements Product{
    private final int quantity;
    private final ArrayList<WoodType> woodTypes;
    private final ArrayList<Integer> woodPercentages;

    public Plywood(int quantity, HashMap<WoodType, Integer> elements) {
        this.quantity = quantity;
        this.woodTypes = new ArrayList<WoodType>(elements.keySet());
        this.woodPercentages= new ArrayList<Integer>(elements.values());
        int check = 0;
        try{
            for (Integer woodPercentage : woodPercentages) {
                check =+woodPercentage;
            }
            if (check != 100){
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Percentages of wood types must add up to 100%");
        }

    }

    @Override
    public String getName() {
        StringBuilder name = new StringBuilder(String.valueOf(woodTypes.get(0)));
        for (int i=1; i< woodTypes.size();i++){
            name.append(" + ").append(woodTypes.get(i));
        }
        return name.toString();
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (int i=1; i< woodPercentages.size();i++){
            price += woodTypes.get(i).price * woodPercentages.get(i);
        }
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
    public String getComposition(){

    }
}
