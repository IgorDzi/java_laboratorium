package lista_3.zadanie_2;


import java.util.ArrayList;
import java.util.HashMap;

public class Plywood extends Product {
    private final int quantity;
    private final ArrayList<WoodType> woodTypes;
    private final ArrayList<Integer> woodPercentages;

    /**
     * @param quantity Liczba sztuk danej sklejki
     * @param elements Typy drewna i ich procentowy skład
     */
    public Plywood(int quantity, HashMap<WoodType, Integer> elements) {
        this.quantity = quantity;
        this.woodTypes = new ArrayList<>(elements.keySet());
        this.woodPercentages = new ArrayList<>(elements.values());
        int check = 0;
        for (Integer woodPercentage : woodPercentages) {
            check += woodPercentage;
        }
        if (check != 100) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String getName() {
        StringBuilder name = new StringBuilder(String.valueOf(woodTypes.get(0)));
        for (int i = 1; i < woodTypes.size(); i++) {
            name.append(" + ").append(woodTypes.get(i));
        }
        return name.toString();
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (int i = 0; i < woodPercentages.size(); i++) {
            price += woodTypes.get(i).price * woodPercentages.get(i);
        }
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    /**
     * @return Skład sklejki
     */
    public String getComposition() {
        StringBuilder composition = new StringBuilder(String.valueOf(woodTypes.get(0))).append(": ").append(woodPercentages.get(0)).append("%\n");
        for (int i = 1; i < woodTypes.size(); i++) {
            composition.append(woodTypes.get(i)).append(": ").append(woodPercentages.get(i)).append("%");
        }
        return composition.toString();
    }


    /**
     * @param WoodType Typ drewna
     * @return True: Dany typ znajduje się w sklejce; False: Dany typ nie znajduje się w sklejce
     */
    public boolean contains(WoodType WoodType) {
        return woodTypes.contains(WoodType);
    }
}
