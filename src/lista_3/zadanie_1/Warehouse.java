package lista_3.zadanie_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Warehouse{


    public static void main(String[] args){


        ArrayList<Product> products = new ArrayList<>();
        Wood wood = new Wood(2,2,2,5, WoodType.OAK);
        Furniture furniture = new Furniture("Table", 50,1910,1,WoodType.ASH);
        HashMap<WoodType, Integer> materials = new HashMap<>();
        materials.put(WoodType.BEECH, 50);
        materials.put(WoodType.ASH, 25);
        materials.put(WoodType.MAHOGANY,25);
        Plywood plywood = null;
        try {
            plywood = new Plywood(10, materials);
        }
         catch (IllegalArgumentException e){
            System.out.println("Percentages of wood types must add up to 100%");
        }

        products.add(wood);
        products.add(furniture);
        products.add(plywood);

        System.out.println(products);
        for (Product product : products) {
            System.out.println(product.getName() +"   |   " + product.getPrice() +"   |   " +  product.getQuantity());
        }



    }
}

