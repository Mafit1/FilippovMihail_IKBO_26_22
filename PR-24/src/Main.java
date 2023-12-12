public class Main {
    public static void main(String[] args) throws OrderAlreadyAddedException {
        Drink water = new Drink("Water", "Still water", 10);
        Drink redWine = new Drink("Red wine", "Old red wile", 40);
        Drink whiteWine = new Drink("White wine", "Old white wine", 50);
        Drink beer = new Drink("Beer", "Favourite Dora's drink", 30);
        Drink cola = new Drink("Cola", "Sparkling cola", 20);

        Dish potatoes = new Dish("Potatoes", "mmmmm... potatos", 40);
        Dish pelmeni = new Dish("Pelmeni", "50 pelmenei, wow", 100);
        Dish pizza1 = new Dish("Margoritta", "Pizza Margoritta", 60);
        Dish pizza2 = new Dish("Peperoni", "Peperoni pizza", 60);






        OrderManager manager = new OrderManager();
        //обычные заказы
        Order order1 = new RestarauntOrder();
        Order order2 = new RestarauntOrder();
        Order order3 = new RestarauntOrder();
        order3.add(pelmeni);
        order3.add(pelmeni);
        //интернет заказы
        Order order4 = new InternetOrder();
        Order order5 = new InternetOrder();
        order5.add(water);
        order5.add(water);
        order5.add(cola);

        //добавление заказа и предметов через менеджера
        manager.placeOrder("table 1", order1);
        manager.addItem("table 1", redWine);
        manager.addItem("table 1", whiteWine);
        manager.addItem("table 1", pizza1);
        manager.addItem("table 1", pizza1);

        manager.placeOrder("table 2", order2);
        manager.addItem("table 2", water);
        manager.addItem("table 2", cola);
        manager.addItem("table 2", pizza1);

        manager.placeOrder("table 3", order3);

        manager.placeOrder("street 1", order4);
        manager.addItem("street 1", beer);
        manager.addItem("street 1", potatoes);

        manager.placeOrder("street 2", order5);
        try {
            manager.placeOrder("street 2", order5);
        }
        catch (OrderAlreadyAddedException e){
            System.out.println(e.getMessage() + "\n");
        }

        System.out.println("Order 1: " + manager.getOrder("table 1"));
        System.out.println("Order 2: " + manager.getOrder("table 2"));
        System.out.println("Order 3: " + manager.getOrder("table 3"));
        System.out.println("Order 4: " + manager.getOrder("street 1"));
        System.out.println("Order 5: " + manager.getOrder("street 2") + "\n");

        System.out.println("Count water in internet orders: " + manager.getAmountOfDishes("Water")+ "\n");

        System.out.println("All internet orders summary is : " + manager.getAllIternetOrdersCost());

    }
}