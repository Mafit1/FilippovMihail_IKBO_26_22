import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items = new ArrayList<>();

    public boolean addItem(Item item) {
        items.add(item);
        return true;
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
    public double getTotalPrice() {
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Order: " + items + "\n";
    }
}