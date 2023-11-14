package lista_5.zadanie_2;

import lista_3.zadanie_1.*;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Warehouse {


    public static void main(String[] args){

        Map<Product, Integer> products = new HashMap<>();
        Wood wood = new Wood(2,2,2,5, WoodType.Oak);
        Furniture furniture = new Furniture("Table", 50,1910,1,WoodType.Ash);
        HashMap<WoodType, Integer> materials = new HashMap<>();
        materials.put(WoodType.Beech, 50);
        materials.put(WoodType.Ash, 25);
        materials.put(WoodType.Mahogany,25);
        Plywood plywood = null;
        try {
            plywood = new Plywood(10, materials);
        }
         catch (IllegalArgumentException e){
            System.out.println("Percentages of wood types must add up to 100%");
        }

        products.put(wood, wood.getQuantity());
        products.put(furniture, furniture.getQuantity());
        assert plywood != null;
        products.put(plywood, plywood.getQuantity());

        for (Map.Entry<Product, Integer> e : products.entrySet())
            System.out.println(e.getKey() + " | "
                    + e.getValue());
    }
}

