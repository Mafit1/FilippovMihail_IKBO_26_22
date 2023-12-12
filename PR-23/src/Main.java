public class Main {
    public static void main(String[] args) {
        Drink water = new Drink("Water", "Still water", 10);
        Dish potatoes = new Dish("Potatoes", "mmmmm... potatos", 40);
        Dish pelmeni = new Dish("Pelmeni", "50 pelmenei, wow", 100);

        Order order1 = new Order();
        order1.addItem(water);
        order1.addItem(potatoes);

        Order order2 = new Order();
        order1.addItem(water);
        order1.addItem(pelmeni);

        Order internetorder = new InternetOrder();
        internetorder.addItem(water);
        internetorder.addItem(pelmeni);
        internetorder.addItem(potatoes);

        TablesOrderManager tablesOrderManager = new TablesOrderManager();
        tablesOrderManager.placeOrder(order1);
        tablesOrderManager.placeOrder(order2);
        tablesOrderManager.placeOrder(internetorder);
        System.out.println(tablesOrderManager);
    }


}