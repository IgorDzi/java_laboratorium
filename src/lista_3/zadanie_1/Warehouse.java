package lista_3.zadanie_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Warehouse{

    private static ArrayList<Product> products = new ArrayList<>();
    public void addProduct(Product product) {
        products.add(product);
    }

    public static void main(String[] args){

        Wood wood = new Wood(2,2,2,5, WoodType.Oak);
        Furniture furniture = new Furniture("Table", 50,1910,1,WoodType.Ash);
        HashMap<WoodType, Integer> materials = new HashMap<WoodType, Integer>();
        materials.put(WoodType.Beech, 50);
        materials.put(WoodType.Ash, 25);
        materials.put(WoodType.Mahogany,25);
        try {
            Plywood plywood = new Plywood(10, materials);
        }
         catch (IllegalArgumentException e){
            System.out.println("Percentages of wood types must add up to 100%");
        }

        products.add(wood);
        System.out.println(products.get(0).getName());
    }
}

