public class FurnitureTest {
    public static void main(String[] args) {
        // Создаем магазин мебели
        FurnitureShop furnitureShop = new FurnitureShop();

        // Добавляем мебель в магазин
        furnitureShop.addFurniture(new Chair("Стул №1", "Дерево", 50.0));
        furnitureShop.addFurniture(new Table("Стол №1", "Стекло", 150.0));

        // Отображаем инвентарь магазина мебели
        furnitureShop.displayInventory();
    }
}

