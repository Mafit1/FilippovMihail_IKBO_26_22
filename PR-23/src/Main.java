public class Main {
    public static void main(String[] args) {
        Drink water = new Drink("Water", "Liquid", 50);
        Dish burger = new Dish("Burger", "Junk food", 200);
        Dish cake = new Dish("Cake", "Dessert", 120);

        Order order1 = new Order();
        order1.addItem(water);
        order1.addItem(burger);

        Order order2 = new Order();
        order2.addItem(water);
        order2.addItem(cake);

        Order internetorder = new InternetOrder();
        internetorder.addItem(water);
        internetorder.addItem(burger);
        internetorder.addItem(cake);

        TablesOrderManager tablesOrderManager = new TablesOrderManager();
        tablesOrderManager.placeOrder(order1);
        tablesOrderManager.placeOrder(order2);
        tablesOrderManager.placeOrder(internetorder);
        System.out.println(tablesOrderManager);
    }


}