package lista_3.zadanie_1;

import java.util.HashMap;

public class Warehouse{


    public static void main(String[] args){
        System.out.println(WoodType.Ash);

        Wood wood = new Wood(2,2,2,5, WoodType.Oak);
        Furniture furniture = new Furniture("Table", 50,1910,1,WoodType.Ash);
        HashMap<WoodType, Integer> materials = new HashMap<WoodType, Integer>();
        materials.put(WoodType.Beech, 50);
        materials.put(WoodType.Ash, 25);
        materials.put(WoodType.Mahogany,25);
        Plywood plywood = new Plywood(10, materials);
    }
}
