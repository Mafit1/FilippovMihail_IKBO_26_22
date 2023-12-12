public interface Order {
    boolean add(Item item);
    boolean remove(String itemName);
    boolean remove(Item item);
    int removeAll(String itemName);
    int removeAll(Item item);
    String[] itemsNames();
    int itemsAmount();
    int itemAmount(String itemName);
    //int itemAmount(MenuItem itemName);
    //MenuItem[] getItems();

    //MenuItem[] sortedItemsByCostDesc();
    int totalCost();
    //Customer getCustomer();
    //void setCustomer(Customer customer);
}