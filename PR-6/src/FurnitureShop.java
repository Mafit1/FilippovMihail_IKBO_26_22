import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
    private List<Furniture> furnitureList;

    public FurnitureShop() {
        furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void displayInventory() {
        System.out.println("Инвентарь магазина мебели:");
        for (Furniture furniture : furnitureList) {
            System.out.println("Название: " + furniture.getName());
            System.out.println("Материал: " + furniture.getMaterial());
            System.out.println("Цена: $" + furniture.getPrice());
            furniture.use();
            System.out.println();
        }
    }
}

