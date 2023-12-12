import java.util.ArrayList;
import java.util.Objects;

public class RestarauntOrder implements Order{
    private ArrayList<Item> items = new ArrayList<>();

    @Override
    public String toString() {
        String res = "";
        for (Item i : items){
            res += i.getName() + ", ";
        }
        return res;
    }

    @Override
    public boolean add(Item item) {
        items.add(item);
        return true;
    }

    @Override
    public boolean remove(String itemName) {
        for (Item i : items){
            if (Objects.equals(i.getName(), itemName)){
                return items.remove(i);
            }
        }
        return false;
    }

    @Override
    public boolean remove(Item item) {
        return items.remove(item);
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for (Item i : items){
            if (Objects.equals(i.getName(), itemName)){
                items.remove(i);
                count++;
            }
        }
        return count;
    }

    @Override
    public int removeAll(Item item) {
        int count = 0;
        for (Item i : items){
            if (i.equals(item)){
                items.remove(i);
                count++;
            }
        }
        return count;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[items.size()];
        int c = 0;
        for (Item i : items){
            names[c] = i.getName();
            c++;
        }
        return names;
    }

    @Override
    public int itemsAmount() {
        return items.size();
    }

    @Override
    public int itemAmount(String itemName) {
        int count = 0;
        for (Item i : items){
            if (Objects.equals(i.getName(), itemName)){
                count++;
            }
        }
        return count;
    }

    @Override
    public int totalCost() {
        int cost = 0;
        for (Item i : items){
            cost += i.getPrice();
        }
        return cost;
    }
}